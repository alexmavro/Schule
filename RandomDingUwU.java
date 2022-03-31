
public class RandomDingUwU
{
    private String[] noten = {"1+ :) Sehr gut... Du kannst wohl doch was du Hu-",
    "1 Glatt... Das ist Sehr gut :)",
    "1-... Du erfüllst wohl du einen Sinn in der gesellschaft",
    "2+... Wäre fast eine 1 gewesen du Haahahah",
    "2... Ist halt gut gewesen XD",
    "2-... hahahah ich weiss es auch nicht",
    "3+... Du befriedigst mich gut",
    "3... Das ist... Befriedigend UwU",
    "3-... Das kann eine 4 werden...",
    "4+... Nicht gut aber auch nicht soooo schlecht",
    "4... Wir nähern uns dem Defizit mein Rabauke",
    "4-... Ich hab mehr erwartet...",
    "5+... Oh gott",
    "5... Ich hab die Hoffnung verloren",
    "5-... zum Glück keine 6",
    "6... Sehr stark"
    };
    
    public void Note()
    {
        System.out.println(noten[(int)((Math.random() * (16 - 0)) + 0)]);
    }
}
