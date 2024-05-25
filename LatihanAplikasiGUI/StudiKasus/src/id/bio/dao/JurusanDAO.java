/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package id.bio.dao;
import id.bio.model.Jurusan;
import java.util.List;
/**
 *
 * @author Nama: Edo Ranov Anjasmara
 * NIM:13020220010
 * Materi:Studi Kasus
 * Waktu:22:40
 */
public interface JurusanDAO {
    public boolean insert(Jurusan j);
    public boolean update(Jurusan j);
    public boolean delete(Jurusan j);
    public List<Jurusan> getAllJurusan();
    public Jurusan getByID (String id);
    public List <Jurusan> getByName(String name);
}
