public class AlienDictionary {
    public static void main(String[] args) {
        String[] spell = new String[]{"z", "d", "x"};
        String[] dic = new String[]{"def", "dww", "dzx", "loveaw"};

        boolean temp = false;
        for(int i = 0; i < dic.length; i++) {
            for(int j = 0; j < spell.length; j++) {
                if(!dic[i].contains(spell[j])) {
                    temp = false;
                    break;
                }else temp = true;
            }
            if(temp) {
                System.out.println(1);
                break;
            }
        }
        if(!temp) {
            System.out.println(2);
        }
    }
}