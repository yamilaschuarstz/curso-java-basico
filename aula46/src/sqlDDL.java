public interface sqlDDL {
    void create(String query);
    void alter(String query);
    void drop (String query);
}
