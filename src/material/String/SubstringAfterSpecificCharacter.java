package material.String;

public class SubstringAfterSpecificCharacter {
    public static void main(String[] args) {
        String url = "http://someurl.app/success?id=374950&operation=285480&reference=long-token-string-value";

        int beginIndex = url.indexOf("operation=") + 10;
        int endIndex = url.lastIndexOf("&reference");

        System.out.println("beginIndex = " + beginIndex);
        System.out.println("endIndex = " + endIndex);

        System.out.println(url.substring(beginIndex, endIndex));


    }
}
