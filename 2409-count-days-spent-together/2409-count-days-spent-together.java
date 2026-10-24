class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int a1 = convert(arriveAlice);
        int a2 = convert(leaveAlice);
        int b1 = convert(arriveBob);
        int b2 = convert(leaveBob);

        int start = Math.max(a1, b1);
        int end = Math.min(a2, b2);

        return Math.max(0, end - start + 1);
    }

    public int convert(String date) {
        int len[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = Integer.parseInt(date.substring(3));
        int months = Integer.parseInt(date.substring(0, 2));

        int total = days;
        for (int i = 0; i < months - 1; i++) {
            total += len[i];
        }

        return total;
    }
}