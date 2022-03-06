package emlakburada.dto.response;






import java.math.BigDecimal;
import java.util.Date;


public class AdvertResponse {

	private int advertNo;
	private String baslik;
	private String[] resimList = new String[5];
	private BigDecimal fiyat;
	private int suresi;
	private boolean oneCikarilsinMi = false;
	private boolean incelendiMi = false;
	private Date olusturulmaTarihi;
	private boolean aktifMi;

}
