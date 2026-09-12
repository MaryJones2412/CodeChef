class Solution {
    public List<Integer> findLeaders(int[] a) {
        int n = a.length;
        List<Integer> l = new ArrayList<>();
        int m = a[n - 1];
        l.add(m);

        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > m) {
                l.add(a[i]);
                m = a[i];
            }
        }

        Collections.reverse(l);
        return l;
    }
}