import java.util.*;
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        int maxPlayTime = Integer.MIN_VALUE;
        m = changeSheet(m);
        for (String musicInfo : musicinfos) {
            StringTokenizer st = new StringTokenizer(musicInfo, ",");
            String start = st.nextToken();
            String end = st.nextToken();
            String musicName = st.nextToken();
            String sheet = st.nextToken();
            int musicLength = parsing(start, end);
            String newSheet = changeSheet(sheet);
            if (musicLength > newSheet.length()) {
                newSheet = newSheet.repeat(musicLength / newSheet.length()) +
                        newSheet.substring(0, musicLength % newSheet.length());
            }else {
                newSheet = newSheet.substring(0, musicLength);
            }
            if (newSheet.contains(m) && musicLength > maxPlayTime) {
                answer = musicName;
                maxPlayTime = musicLength;
            }
        }
        if (maxPlayTime != Integer.MIN_VALUE) {
            return answer;
        }else return "(None)";
    }
    static int parsing(String start, String end) {
        StringTokenizer st = new StringTokenizer(start, ":");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(end, ":");
        int endHour = Integer.parseInt(st.nextToken());
        int endMinute = Integer.parseInt(st.nextToken());
        return (endHour - hour) * 60 + (endMinute - minute);
    }
    static String changeSheet(String sheet) {
        sheet = sheet.replaceAll("C#", "H");
        sheet = sheet.replaceAll("D#", "I");
        sheet = sheet.replaceAll("F#", "J");
        sheet = sheet.replaceAll("G#", "K");
        return sheet.replaceAll("A#", "L");
    }
}