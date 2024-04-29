    import java.util.*;
    public class DequeExamples {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int result = 0;
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();

                // Add the element to the deque and update frequency map
                deque.offer(num);
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

                // If the deque size exceeds m, remove elements from the front
                while (deque.size() > m) {
                    int removed = deque.poll();
                    frequencyMap.put(removed, frequencyMap.get(removed) - 1);
                    if (frequencyMap.get(removed) == 0) {
                        frequencyMap.remove(removed);
                    }
                }

                // Update result with the maximum number of unique integers
                result = Math.max(result, frequencyMap.size());
            }
            in.close();
            System.out.println(result); // Print the result
            }
    }



  
