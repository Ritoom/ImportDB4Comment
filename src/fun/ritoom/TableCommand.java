package fun.ritoom;

public class TableCommand {
    String column_name;
    String note;
    String command;

    public String getColumn_name() {
        return column_name;
    }

    public void setColumn_name(String column_name) {
        this.column_name = column_name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "TableCommand{" +
                "column_name='" + column_name + '\'' +
                ", note='" + note + '\'' +
                ", command='" + command + '\'' +
                '}';
    }
}
