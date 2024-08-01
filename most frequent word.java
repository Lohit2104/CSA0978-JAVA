import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();
        
        System.out.println("Enter banned words (comma-separated):");
        String[] banned = scanner.nextLine().split(",");
        
        // Trim the whitespace from each banned word
        for (int i = 0; i < banned.length; i++) {
            banned[i] = banned[i].trim();
        }
        
        String result = mostFrequentWord(paragraph, banned);
        System.out.println("Most frequent word: " + result);
        
        scanner.close();
    }

    public static String mostFrequentWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Normalize the paragraph: convert to lowercase and split into words
        String[] words = paragraph.toLowerCase().split("\\W+");
        
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        String mostFrequent = null;
        int maxCount = 0;
        
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        
        return mostFrequent;
    }
}
