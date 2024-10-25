class Probelm {
    public List<String> removeSubfolders(String[] folder) {
        List<String> res = new ArrayList<>();
        Arrays.sort(folder);

        res.add(folder[0]);

        for(int i=1; i<folder.length; i++){
            String str = folder[i];
            String prev = res.get(res.size() - 1);
            prev += '/';

            if(str.startsWith(prev) == false){
                res.add(str);
            }
        }

        return res;
    }
}