package ys.app.petproject.widgetprovider;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * appwidgetid
 * 
 * @author TIANHUI
 * 
 */
@Entity
public class AppWidgetIdInfo  {
	@Id(autoincrement = true)
	private Long id;
	public String appWidgetId;//appwidgeid
	public String getAppWidgetId() {
		return this.appWidgetId;
	}
	public void setAppWidgetId(String appWidgetId) {
		this.appWidgetId = appWidgetId;
	}
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Generated(hash = 1412979910)
	public AppWidgetIdInfo(Long id, String appWidgetId) {
		this.id = id;
		this.appWidgetId = appWidgetId;
	}
	@Generated(hash = 257639893)
	public AppWidgetIdInfo() {
	}



}
