public interface BancoDeDados extends sqlDCL, sqlDDL, sqlDML{
    void abrirConexao();
    void fecharConexao();
}
