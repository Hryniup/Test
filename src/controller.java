
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.*;

public class controller {
    @FXML
    Button b1;
    @FXML
    Button b2;
    @FXML
    Button pokazDlugosc;
    @FXML
    TextField tf1;
    @FXML
    TextField tf2;
    @FXML
    TextField dlugoscListy;


    private List<Integer> numbs = new ArrayList<>();
    private int x = 0;

    public void B1() {
        String s = tf1.getText();
        int i = Integer.parseInt(s);
        numbs.add(i);
        if (i > x)
            x = i;

        tf1.clear();
        tf2.setText(String.valueOf(x));

    }

    public void B2() {
        Random r = new Random();
        int i = r.nextInt(100);
        numbs.add(i);
        if (i > x)
            x = i;
        tf2.setText(String.valueOf(x));

    }
//        public void getMax(List<Integer> numbs){
//            for (int i = 0; i < numbs.size(); i++) {
//                numbs.get(i);
//                tf2.setText(String.valueOf(numbs.get(i)));
//            }
//
//        }


    public void pokazDlugosc() {
        dlugoscListy.setText(String.valueOf(numbs.size()));

    }


}


