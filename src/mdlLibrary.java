/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dwi Candra Permana
 */
public class mdlLibrary {
    public  String amibios(String beepcode) {
        String problems = null, solutions = null;
        switch (beepcode) {
            case "1 Pendek":
                problems = "DRAM Refresh Failure";
                solutions = "Bersihkan RAM, atau ganti RAM";
                break;
            case "2 Pendek":
                problems = "Parity circuit failure";
                solutions = "";
                break;
            case "3 Pendek":
                problems = "Base 64K RAM Failure";
                solutions = "1. Bersihkan RAM<br>"
                        + "2. Gantikan salah satu RAM dengan yang baru<br>"
                        + "3. Tukar posisi RAM<br>"
                        + "4. Restart PC";
                break;
            case "4 Pendek":
                problems = "System timer failure";
                solutions = "1. Keluarkan semua perangkat baru, perangkat disk, maupun USB<br>"
                        + "2. Periksa seluruh kipas<br>"
                        + "3. Periksa seluruh kabel<br>"
                        + "4. Keluarkan semua kartu ekspansi (expansion card)<br>"
                        + "5. Lepaskan Harddisk<br>"
                        + "6. Keluarkan salah satu RAM yang bermasalah";
                break;
            case "5 Pendek":
                problems = "Process Failure";
                solutions = "1. Keluarkan semua perangkat baru, perangkat disk, maupun USB<br>"
                        + "2. Periksa seluruh kipas<br>"
                        + "3. Periksa seluruh kabel<br>"
                        + "4. Keluarkan semua kartu ekspansi (expansion card)<br>"
                        + "5. Lepaskan Harddisk<br>"
                        + "6. Keluarkan salah satu RAM yang bermasalah";
                break;
            case "6 Pendek":
                problems = "Keyboard controller Gate A20 error";
                solutions = "1. Pastikan keyboard terhubung ke komputer<br>"
                        + "2. Matikan komputer dan putuskan keyboard. Periksa bahwa tidak ada yang bengkok, terbakar, maupun pin yang rusak pada konektor keyboard atau pada port keyboard di PC<br>"
                        + "3. Ganti keyboard<br>"
                        + "4. Jika masih dengan error yang sama, kemungkinan besar motherboardnya memiliki kontroller yang rusak yang harus diganti.";
                break;
            case "7 Pendek":
                problems = "Virtual mode exception error";
                solutions = "1. Keluarkan semua perangkat baru, perangkat disk, maupun USB<br>"
                        + "2. Periksa seluruh kipas<br>"
                        + "3. Periksa seluruh kabel<br>"
                        + "4. Keluarkan semua kartu ekspansi (expansion card)<br>"
                        + "5. Lepaskan Harddisk<br>"
                        + "6. Keluarkan salah satu RAM yang bermasalah";
                break;
            case "8 Pendek":
                problems = "Display memory Read/Write test failure";
                solutions = "1. Keluarkan semua perangkat baru, perangkat disk, maupun USB<br>"
                        + "2. Periksa seluruh kipas<br>"
                        + "3. Periksa seluruh kabel<br>"
                        + "4. Keluarkan semua kartu ekspansi (expansion card)<br>"
                        + "5. Lepaskan Harddisk<br>"
                        + "6. Keluarkan salah satu RAM yang bermasalah";
                break;
            case "9 Pendek":
                problems = "ROM BIOS checksum error";
                solutions = "1. Keluarkan semua perangkat baru, perangkat disk, maupun USB<br>"
                        + "2. Periksa seluruh kipas<br>"
                        + "3. Periksa seluruh kabel<br>"
                        + "4. Keluarkan semua kartu ekspansi (expansion card)<br>"
                        + "5. Lepaskan Harddisk<br>"
                        + "6. Keluarkan salah satu RAM yang bermasalah";
                break;
            case "10 Pendek":
                problems = "CMOS shutdown Read/Write error";
                solutions = "Ganti baterai CMOS. Jika masih terjadi, kemungkinan besar kerusakan terjadi antara Power Supply atau pada Motherboard.";
                break;
            case "11 Pendek":
                problems = "Cache memory error";
                solutions = "1. Keluarkan semua perangkat baru, perangkat disk, maupun USB<br>"
                        + "2. Periksa seluruh kipas<br>"
                        + "3. Periksa seluruh kabel<br>"
                        + "4. Keluarkan semua kartu ekspansi (expansion card)<br>"
                        + "5. Lepaskan Harddisk<br>"
                        + "6. Keluarkan salah satu RAM yang bermasalah";
                break;
            case "1 Panjang, 3 Pendek":
                problems = "Conventional/Extended memory failure";
                solutions = "1. Keluarkan semua perangkat baru, perangkat disk, maupun USB<br>"
                        + "2. Periksa seluruh kipas<br>"
                        + "3. Periksa seluruh kabel<br>"
                        + "4. Keluarkan semua kartu ekspansi (expansion card)<br>"
                        + "5. Lepaskan Harddisk<br>"
                        + "6. Keluarkan salah satu RAM yang bermasalah";
                break;
            case "1 Panjang, 8 Pendek":
                problems = "Display/Retrace test failed";
                solutions = "1. Keluarkan semua perangkat baru, perangkat disk, maupun USB<br>"
                        + "2. Periksa seluruh kipas<br>"
                        + "3. Periksa seluruh kabel<br>"
                        + "4. Keluarkan semua kartu ekspansi (expansion card)<br>"
                        + "5. Lepaskan Harddisk<br>"
                        + "6. Keluarkan salah satu RAM yang bermasalah";
                break;
            case "Dua Nada yang berbeda":
                problems = "Low CPU Fan speed, voltage level issue";
                solutions = "Ganti kipas yang lemah";
                break;
        }
        return "<html><b><u>MASALAH:</u></b><br>"
                + problems + "<br><br>"
                + "<b><u>SOLUSI:</u></b><br>"
                + solutions + "</html>";
    }
    
    public  String awardbios(String beepcode) {
        String problems = null, solutions = null;
        switch (beepcode) {
            case "1 Panjang, 2 Pendek":
                problems = "Display/Video Error";
                solutions = "BIOS tidak dapat menampilkan informasi apapun. Ganti VGA yang terpasang";
                break;
            case "1 Panjang, 3 Pendek":
                problems = "Video card not detected or bad.";
                solutions = "Ganti VGA";
                break;
            case "1 Panjang, 9 Pendek":
                problems = "Motherboard issues.";
                solutions = "Ganti Chipset BIOS";
                break;
            case "Berulang tanpa henti":
                problems = "Base 64K RAM Failure";
                solutions = "1. Bersihkan RAM<br>"
                        + "2. Gantikan salah satu RAM dengan yang baru<br>"
                        + "3. Tukar posisi RAM<br>"
                        + "4. Restart PC";
                break;
            case "Berulang-ulang dan bernada tinggi ketika PC dihidupkan":
                problems = "Overheating processor (CPU)";
                solutions = "1. Matikan PC<br>"
                        + "2. Periksa kipas prosesor. Jika putarannya lemah, ganti kipas prosesor<br>"
                        + "3. Periksa kipas pendingin yang lain"
                        + "";
                break;
            case "Bunyi nada tinggi dan nada rendah berulang-ulang":
                problems = "Issue with the processor";
                solutions = "Ganti prosesor pada PC Anda.";
                break;
        }
        return "<html><b><u>MASALAH:</u></b><br>"
                + problems + "<br><br>"
                + "<b><u>SOLUSI:</u></b><br>"
                + solutions + "</html>";
    }
    
    public  String dell(String beepcode) {
        String problems = null, solutions = null;
        switch (beepcode) {
            case "1 Pendek":
                problems = "BIOS ROM corruption or failure";
                solutions = "Ganti ROM pada Motherboard, atau ganti motherboard.";
                break;
            case "2 Pendek":
                problems = "Memory (RAM) not detected";
                solutions = "Bersihkan RAM, atau ganti RAM yang bermasalah dengan yang lain.";
                break;
            case "3 Pendek":
                problems = "Motherboard Failure";
                solutions = "Ganti motherboard.";
                break;
            case "4 Pendek":
                problems = "Memory (RAM) Failure";
                solutions = "Bersihkan RAM, atau ganti RAM yang bermasalah dengan yang lain.";
                break;
            case "5 Pendek":
                problems = "CMOS battery failure";
                solutions = "Ganti baterai CMOS pada motherboard";
                break;
            case "6 Pendek":
                problems = "Video Card failure";
                solutions = "Ganti VGA";
                break;
            case "7 Pendek":
                problems = "Bad Processor (CPU)";
                solutions = "Ganti prosesor";
                break;
        }
        return "<html><b><u>MASALAH:</u></b><br>"
                + problems + "<br><br>"
                + "<b><u>SOLUSI:</u></b><br>"
                + solutions + "</html>";
    }
    public  String ibm(String beepcode) {
        String problems = null, solutions = null;
        switch (beepcode) {
            case "Tidak ada bunyi":
                problems = "No power, loose card, or short";
                solutions = "1. Periksa kabel power, mungkin tidak tersambung dengan benar<br>"
                        + "2. Periksa kabel yang menghubungkan PC dengan Stopkontak atau Surge Protector (UPS/Stabilizer/yang lain)";
                break;
            case "1 bunyi pendek":
                problems = "Normal";
                solutions = "";
                break;
            case "2 bunyi pendek":
                problems = "POST ERROR";
                solutions = "Lihat pada layar untuk keterangan errornya.";
                break;
            case "Bunyi terus-menerus":
                problems = "No power, loose card, or short";
                solutions = "1. Periksa kabel power, mungkin tidak tersambung dengan benar<br>"
                        + "2. Periksa kabel yang menghubungkan PC dengan Stopkontak atau Surge Protector (UPS/Stabilizer/yang lain)";
                break;
            case "Bunyi pendek berulang-ulang":
                problems = "No power, loose card, or short";
                solutions = "1. Periksa kabel power, mungkin tidak tersambung dengan benar<br>"
                        + "2. Periksa kabel yang menghubungkan PC dengan Stopkontak atau Surge Protector (UPS/Stabilizer/yang lain)";
                break;
            case "1 panjang dan 1 pendek":
                problems = "Masalah pada Motherboard";
                solutions = "1. Keluarkan semua perangkat baru, perangkat disk, maupun USB<br>"
                        + "2. Periksa seluruh kipas<br>"
                        + "3. Periksa seluruh kabel<br>"
                        + "4. Keluarkan semua kartu ekspansi (expansion card)<br>"
                        + "5. Lepaskan Harddisk<br>"
                        + "6. Keluarkan salah satu RAM yang bermasalah";
                break;
            case "1 panjang dan 2 pendek":
                problems = "Video (Mono/CGA display circuitry) issue.";
                solutions = "1. Keluarkan semua perangkat baru, perangkat disk, maupun USB<br>"
                        + "2. Periksa seluruh kipas<br>"
                        + "3. Periksa seluruh kabel<br>"
                        + "4. Keluarkan semua kartu ekspansi (expansion card)<br>"
                        + "5. Lepaskan Harddisk<br>"
                        + "6. Keluarkan salah satu RAM yang bermasalah";
                break;
            case "1 panjang dan 3 pendek":
                problems = "Video (EGA) display circuitry.";
                solutions = "1. Keluarkan semua perangkat baru, perangkat disk, maupun USB<br>"
                        + "2. Periksa seluruh kipas<br>"
                        + "3. Periksa seluruh kabel<br>"
                        + "4. Keluarkan semua kartu ekspansi (expansion card)<br>"
                        + "5. Lepaskan Harddisk<br>"
                        + "6. Keluarkan salah satu RAM yang bermasalah";
                break;
            case "3 panjang":
                problems = "Keyboard or keyboard card error.";
                solutions = "1. Sambungkan keyboard dengan benar<br>"
                        + "2. Periksa tombol keyboard yang bermasalah (stuck)<br>"
                        + "3. Ganti Keyboard<br>"
                        + "4. Jika masih bermasalah, kemungkinan besar port PS/2 atau port AT rusak";
                break;
            case "1 bunyi, tampilan kosong atau kacau":
                problems = "Video display circuitry.";
                solutions = "1. Keluarkan semua perangkat baru, perangkat disk, maupun USB<br>"
                        + "2. Periksa seluruh kipas<br>"
                        + "3. Periksa seluruh kabel<br>"
                        + "4. Keluarkan semua kartu ekspansi (expansion card)<br>"
                        + "5. Lepaskan Harddisk<br>"
                        + "6. Keluarkan salah satu RAM yang bermasalah";
                break;
        }
        return "<html><b><u>MASALAH:</u></b><br>"
                + problems + "<br><br>"
                + "<b><u>SOLUSI:</u></b><br>"
                + solutions + "</html>";
    }
    public  String macintosh(String beepcode) {
        String problems = null, solutions = null;
        switch (beepcode) {
            case "Nada Error (dua bentuk nada berbeda)":
                problems = "Masalah di Logic Board atau Bus SCSI";
                solutions = "";
                break;
            case "Bunyi startup, putaran disk, tidak ada tampilan":
                problems = "Masalah pada kontroler video";
                solutions = "";
                break;
            case "Power menyala, tidak ada bunyi":
                problems = "Masalah pada Logic Board";
                solutions = "";
                break;
            case "Bunyi keras, 4 bunyi lebih keras":
                problems = "Masalah pada SIMM";
                solutions = "";
                break;
        }
        return "<html><b><u>MASALAH:</u></b><br>"
                + problems + "<br><br>"
                + "<b><u>SOLUSI:</u></b><br>"
                + solutions + "</html>";
    }
    public  String phoenixbios(String beepcode) {
        String problems = null, solutions = null;
        switch (beepcode) {
            case "Dua Nada yang berbeda":
                problems = "Low CPU Fan speed, voltage level issue";
                solutions = "Ganti kipas yang lemah";
                break;
            case "1-1-4":
                problems = "BIOS issues";
                solutions = "";
                break;
            case "1-2-1":
                problems = "Motherboard issues";
                solutions = "Ganti motherboard";
                break;
            case "1-3-1":
                problems = "RAM issues";
                solutions = "Pasangkan kembali RAM dengan benar";
                break;
            case "3-1-1":
                problems = "Motherboard issues";
                solutions = "Ganti motherboard";
                break;
            case "3-3-4":
                problems = "Graphic Card issues";
                solutions = "Pasangkan VGA dengan benar, atau ganti VGA";
                break;
            case "1-1-1-1":
                problems = "Bunyi beep belum dikonfirmasi";
                solutions = "Pasang ulang RAM atau ganti RAM yang bermasalah.";
                break;
            case "1-1-1-3":
                problems = "Verify real mode";
                solutions = "";
                break;
            case "1-1-2-1":
                problems = "Get CPU type";
                solutions = "";
                break;
            case "1-1-2-3":
                problems = "Initialize system hardware";
                solutions = "";
                break;
            case "1-1-3-1":
                problems = "Initialize chipset registers with initial POST values";
                solutions = "";
                break;
            case "1-1-3-2":
                problems = "Set in POST flag";
                solutions = "";
                break;
            case "1-1-3-3":
                problems = "Initialize CPU registers";
                solutions = "";
                break;
            case "1-1-4-1":
                problems = "Initialize cache to initial POST values";
                solutions = "";
                break;
            case "1-1-4-3":
                problems = "Initialize I/O";
                solutions = "";
                break;
            case "1-2-1-1":
                problems = "Initialize power management";
                solutions = "";
                break;
            case "1-2-1-2":
                problems = "Load alternate registers with initial POST values";
                solutions = "";
                break;
            case "1-2-1-3":
                problems = "Jump to UserPatch0";
                solutions = "";
                break;
            case "1-2-2-1":
                problems = "Initialize keyboard controller";
                solutions = "";
                break;
            case "1-2-2-3":
                problems = "BIOS ROM checksum";
                solutions = "";
                break;
            case "1-2-3-1":
                problems = "8254 timer initialization";
                solutions = "";
                break;
            case "1-2-3-3":
                problems = "8237 DMA controller initialization";
                solutions = "";
                break;
            case "1-2-4-1":
                problems = "Reset programmable interrupt controller";
                solutions = "";
                break;
            case "1-3-1-1":
                problems = "Test DRAM refresh";
                solutions = "";
                break;
            case "1-3-1-3":
                problems = "Test 8742 keyboard controller";
                solutions = "";
                break;
            case "1-3-2-1":
                problems = "Set ES segment to register to 4 GB";
                solutions = "";
                break;
            case "1-3-3-1":
                problems = "Autosize DRAM";
                solutions = "";
                break;
            case "1-3-3-3":
                problems = "Clear 512 K base RAM";
                solutions = "";
                break;
            case "1-3-4-1":
                problems = "Test 512 base address lines";
                solutions = "";
                break;
            case "1-3-4-3":
                problems = "Test 512 K base memory";
                solutions = "";
                break;
            case "1-4-1-3":
                problems = "Test CPU bus clock frequency";
                solutions = "";
                break;
            case "1-4-2-4":
                problems = "Reinitialize the chipset";
                solutions = "";
                break;
            case "1-4-3-1":
                problems = "Shadow system BIOS ROM";
                solutions = "";
                break;
            case "1-4-3-2":
                problems = "Reinitialize the cache";
                solutions = "";
                break;
            case "1-4-3-3":
                problems = "Autosize cache";
                solutions = "";
                break;
            case "1-4-4-1":
                problems = "Configure advanced chipset registers";
                solutions = "";
                break;
            case "1-4-4-2":
                problems = "Load alternate registers with CMOS values.";
                solutions = "";
                break;
            case "2-1-1-1":
                problems = "Set initial CPU speed";
                solutions = "";
                break;
            case "2-1-1-3":
                problems = "Initialize interrupt vectors";
                solutions = "";
                break;
            case "2-1-2-1":
                problems = "Initialize BIOS interrupts";
                solutions = "";
                break;
            case "2-1-2-3":
                problems = "Check ROM Copyright notice";
                solutions = "";
                break;
            case "2-1-2-4":
                problems = "Initialize manager for PCI options ROMs";
                solutions = "";
                break;
            case "2-1-3-1":
                problems = "Check video configuration against CMOS";
                solutions = "";
                break;
            case "2-1-3-2":
                problems = "Initialize PCI bus and devices";
                solutions = "";
                break;
            case "2-1-3-3":
                problems = "Initialize all video adapters in system";
                solutions = "";
                break;
            case "2-1-4-1":
                problems = "Shadow video BIOS ROM";
                solutions = "";
                break;
            case "2-1-4-3":
                problems = "Display Copyright notice";
                solutions = "";
                break;
            case "2-2-1-1":
                problems = "Display CPU type and speed";
                solutions = "";
                break;
            case "2-2-1-3":
                problems = "Test keyboard";
                solutions = "";
                break;
            case "2-2-2-1":
                problems = "Set key click if enabled";
                solutions = "";
                break;
            case "2-2-2-3":
                problems = "Enable keyboard";
                solutions = "";
                break;
            case "2-2-3-1":
                problems = "Test for unexpected interrupts";
                solutions = "";
                break;
            case "2-2-3-3":
                problems = "Display prompt Press F2 to enter SETUP";
                solutions = "";
                break;
            case "2-2-4-1":
                problems = "Test RAM between 512 and 640 k";
                solutions = "";
                break;
            case "2-3-1-1":
                problems = "Test expanded memory";
                solutions = "";
                break;
            case "2-3-1-3":
                problems = "Test extended memory address lines";
                solutions = "";
                break;
            case "2-3-2-1":
                problems = "Jump to UserPatch1";
                solutions = "";
                break;
            case "2-3-2-3":
                problems = "Configure advanced cache registers";
                solutions = "";
                break;
            case "2-3-3-1":
                problems = "Enable external and CPU caches";
                solutions = "";
                break;
            case "2-3-3-3":
                problems = "Display external cache size";
                solutions = "";
                break;
            case "2-3-4-1":
                problems = "Display shadow message";
                solutions = "";
                break;
            case "2-3-4-3":
                problems = "Display non-disposable segments";
                solutions = "";
                break;
            case "2-4-1-1":
                problems = "Display error messages";
                solutions = "Periksa output pada layar";
                break;
            case "2-4-1-3":
                problems = "Check for configuration errors";
                solutions = "";
                break;
            case "2-4-2-1":
                problems = "Test real-time clock";
                solutions = "";
                break;
            case "2-4-2-3":
                problems = "Check for keyboard errors";
                solutions = "";
                break;
            case "2-4-4-1":
                problems = "Set up hardware interrupts vectors";
                solutions = "";
                break;
            case "2-4-4-3":
                problems = "Test coprocessor if present";
                solutions = "";
                break;
        }
        return "<html><b><u>MASALAH:</u></b><br>"
                + problems + "<br><br>"
                + "<b><u>SOLUSI:</u></b><br>"
                + solutions + "</html>";
    }
}
