// 22:18
// Q)
// 1. identifier with empty is available?
// => nope
// 2. all words have identifier ?
// => yeap
// 3. what is a identifier? 
// => the word whicch has a specific rule 
// 4. any other exceptional case? uppercase words, other words..
// => maybe

// ordering
// 1. letter (lexi)
// 2. digit
import java.util.StringJoiner;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
            List<String> letterLogs = new ArrayList<>();
    List<String> digitLogs = new ArrayList<>();
    for (String log : logs) {
      if (isDigit(log.charAt(log.length() - 1))) {
        digitLogs.add(log);
      } else {
        letterLogs.add(log);
      }
    }

    List<String> sortedLetterLogs = letterLogs.stream()
        .sorted(Comparator.comparing((String log) -> {
          String identifier = log.split(" ")[0];
          return log.substring(identifier.length());
        }).thenComparing((String log) -> {
          String identifier = log.split(" ")[0];
          return identifier;
        }))
        .collect(Collectors.toList());

    sortedLetterLogs.addAll(digitLogs);
    return sortedLetterLogs.toArray(String[]::new);
    }
    
  private static boolean isDigit(Character character) {
    return (int) character >= 48 && (int) character <= 57;
  }

}