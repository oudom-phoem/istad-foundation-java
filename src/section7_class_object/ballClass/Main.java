package section7_class_object.ballClass;

import section7_class_object.ballClass.model.Ball;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.time.Instant;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        Ball[] balls = new Ball[2];
        Ball ball1 = new Ball(1, "Football", Date.from(Instant.now()), 15.3, 20D);
        Ball ball2 = new Ball(2, "Volleyball", Date.from(Instant.now()), 13.5, 10D);
        balls[0] = ball1;
        balls[1] = ball2;

        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        String[] columNames = {"ID", "Ball Type", "Published Date", "Price", "Discount"};
        for(int i=0; i < columNames.length;i++){
            table.addCell(columNames[i], new CellStyle(CellStyle.HorizontalAlign.center));
            table.setColumnWidth(i,20,30);

        }
        for (Ball ball : balls) {
            table.addCell(ball.getId().toString(), new CellStyle(CellStyle.HorizontalAlign.center));
            table.addCell(ball.getBallType(), new CellStyle(CellStyle.HorizontalAlign.center));
            table.addCell(ball.getPublishedDate().toString(), new CellStyle(CellStyle.HorizontalAlign.center));
            table.addCell("$" + ball.getPrice().toString(), new CellStyle(CellStyle.HorizontalAlign.center));
            table.addCell(ball.getDiscountAmount().toString() + "%", new CellStyle(CellStyle.HorizontalAlign.center));
        }

        System.out.println(table.render());



    }
}


