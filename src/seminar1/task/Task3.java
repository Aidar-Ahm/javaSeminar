package seminar1.task;

public class Task3 {
    public static int getMaxOneCount (int[] arg) {
        int maxCount = 0;
        int count = 0;
        for (int item:arg){
            if (item == 1) count++;
            else{
                if (count > maxCount) maxCount = count;
                count = 0;
            }
            if (count > maxCount) maxCount = count;
        }
        return maxCount;
    }
}
