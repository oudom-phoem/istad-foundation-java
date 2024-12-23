package section7_class_object.userClass;

import section7_class_object.userClass.model.User;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Table table = new Table(8, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        String[] columNames = {"ID","UUID","User Name","Email","Password","Is Deleted","Is Verified", "Created Date"};

        for(int i = 0; i < columNames.length; i++){
            table.addCell(columNames[i], new CellStyle(CellStyle.HorizontalAlign.center));
            table.setColumnWidth(i,20,30);
        }

        User user = new User();
        user.inputUserInfo(scanner);
        table.addCell(user.id.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.uuid, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.username, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.email, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.password, new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.isDeleted.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.isVerified.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
        table.addCell(user.creationDate.toString(), new CellStyle(CellStyle.HorizontalAlign.center));
        System.out.println(table.render());
    }
}