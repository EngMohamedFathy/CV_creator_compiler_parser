package formal_project;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;

public class KeywordStyledDocument extends DefaultStyledDocument {

    private static final long serialVersionUID = 1L;
    private Style _defaultStyle;
    private Style _cwStyle1;
    private Style _cwStyle2;

    public KeywordStyledDocument(Style defaultStyle, Style cwStyle1, Style cwStyle2) {
        _defaultStyle = defaultStyle;
        _cwStyle1 = cwStyle1;
        _cwStyle2 = cwStyle2;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offset, str, a);
        refreshDocument();
    }

    @Override
    public void remove(int offs, int len) throws BadLocationException {
        super.remove(offs, len);
        refreshDocument();
    }

    private synchronized void refreshDocument() throws BadLocationException {
        String text = getText(0, getLength());
        final List<HiliteWord> listWords1 = processWords1(text);
        final List<HiliteWord> listWords2 = processWords2(text);

        setCharacterAttributes(0, text.length(), _defaultStyle, true);
        for (HiliteWord word : listWords1) {
            int p0 = word._position;
            setCharacterAttributes(p0, word._word.length(), _cwStyle1, true);
        }
        for (HiliteWord word : listWords2) {
            int p0 = word._position;
            setCharacterAttributes(p0, word._word.length(), _cwStyle2, true);
        }
    }

    private static List<HiliteWord> processWords1(String content) {
        content += " ";
        List<HiliteWord> hiliteWords = new ArrayList<HiliteWord>();
        int lastWhitespacePosition = 0;
        String word = "";
        char[] data = content.toCharArray();

        for (int index = 0; index < data.length; index++) {
            char ch = data[index];
            if (!(Character.isLetter(ch) || Character.isDigit(ch) || ch == '_')) {
                lastWhitespacePosition = index;
                if (word.length() > 0) {
                    if (isReservedWord1(word)) {
                        hiliteWords.add(new HiliteWord(word, (lastWhitespacePosition - word.length())));
                    }
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        return hiliteWords;
    }

    private static List<HiliteWord> processWords2(String content) {
        content += " ";
        List<HiliteWord> hiliteWords = new ArrayList<HiliteWord>();
        int lastWhitespacePosition = 0;
        String word = "";
        char[] data = content.toCharArray();

        for (int index = 0; index < data.length; index++) {
            char ch = data[index];
            if (!(Character.isLetter(ch) || Character.isDigit(ch) || ch == '_')) {
                lastWhitespacePosition = index;
                if (word.length() > 0) {
                    if (isReservedWord2(word)) {
                        hiliteWords.add(new HiliteWord(word, (lastWhitespacePosition - word.length())));
                    }
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        return hiliteWords;
    }

    private static final boolean isReservedWord1(String word) {
        return (word.trim().equals("Employment")
                || word.trim().equals("Education")
                || word.trim().equals("Skills")
                || word.trim().equals("Name")
                || word.trim().equals("Job")
                || word.trim().equals("Profile")
                || word.trim().equals("Hobby")
                || word.trim().equals("Pro_img")
                || word.trim().equals("Contact")
                || word.trim().equals("Emp_line1")
                || word.trim().equals("Emp_line2")
                || word.trim().equals("Emp_line3")
                || word.trim().equals("Edu_line1")
                || word.trim().equals("Edu_line2")
                || word.trim().equals("Edu_line3")
                || word.trim().equals("Sk_line1")
                || word.trim().equals("Sk_line2")
                || word.trim().equals("Sk_line3"));
    }
    /*Employment[bkColor=red,color=black];\n"
     + "Emp_line1[date=10,text=from_egypt1];\n"
     + "Emp_line2[date=20,text=from_egypt2];\n"
     + "Emp_line3[date=30,text=from_egypt3];\n"
     + "Education[bkColor=yellow,color=red];\n"
     + "Edu_line1[date=40,text=from_egypt4];\n"
     + "Edu_line2[date=50,text=from_egypt5];\n"
     + "Edu_line3[date=60,text=from_egypt6];\n"
     + "Skills[bkColor=orange,color=white];\n"
     + "Sk_line1[text=java1];\n"
     + "Sk_line2[text=java1];\n"
     + "Sk_line3[text=java1];\n"
     + "Name[text=java1];\n"
     + "Jop[text=java1];\n"
     + "Profile[text=java1];\n"
     + "Contact[text=java1];\n"
     + "Hobby[text=java1];\n"
     + "Pro_img[src=C:\\Users\\mysterious#2\\Desktop\\5.jpg];\n"*/

    private static final boolean isReservedWord2(String word) {
        return (word.trim().equals("bkcolor")
                || word.trim().equals("color")
                || word.trim().equals("date")
                || word.trim().equals("text")
                || word.trim().equals("src")
                || word.trim().equals("]")
                || word.trim().equals("["));
    }
}
