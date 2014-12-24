# 2014系統分析與設計 3A第一組#

## 成員 ##

- 學號：0124021 姓名：曾譯生 
- 學號：0124043 姓名：邱子晉
- 學號：0124049 姓名：黃俊欽 
- 學號：0124055 姓名：吳浚瑋 
- 學號：0124093 姓名：施旻廷 


#專案名稱：剪輯系統#
**一：專案說明(邱子晉)：**
<br>
 　　你是否曾經有過螢幕截圖過程太複雜麻煩的困擾呢？以前的你想要截圖時，是不是要先將截圖畫面貼進小畫家，在選取想要的範圍，剪下再貼上一次，然後才能儲存想要的截圖畫面呢。現在的你不用煩惱囉！想像一下，當你想要截圖時，只要開啟一個小程式，按下滑鼠拉框選取你想要的截圖範圍，一放開便可直接儲存於你想要的目的位址，是不是變得超級方便呀！「一鍵截圖」將滿足你的截圖慾、節省你的截圖時間，讓截圖這件事不再是使用電腦時的麻煩之一囉！

**二：利害關係人目標表 (吳浚瑋)：**
<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td><p>利害關係人</p></td>
		<td><p>目標</p></td>
	</tr>
	<tr>
		<td><p>顧客</p></td>
		<td><p>使用程式取得使用者想要截取的圖，並在使用中提供更好的想法給程式專案人員。</p></td>
	</tr>
<table>

**三：事件與使用案例表(曾譯生)：**

<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td><p>事件名稱</p></td>
		<td><p>使用案例名稱</p></td>
	</tr>
	<tr>
		<td><p>1. 找尋欲截取之資料</p></td>
		<td><p>1. 截取圖片作業</p></td>
	</tr>
	<tr>
		<td>2. 儲存截取之圖檔</td>
		<td>2.儲存圖片作業</td>
	</tr>
	<tr>
		<td>3. 搜尋截取之圖檔</td>
		<td>3. 搜尋已儲存之圖片作業</td>
	</tr>
	<tr>
		<td>4.回報問題</td>
		<td>4. 問題整理及分類作業</td>
	</tr>
<table>

**四：使用案例圖(黃俊欽)**

<a href="http://imgur.com/MceuSMZ"><img src="http://i.imgur.com/MceuSMZ.jpg" title="source: imgur.com" /></a>

**五：個別使用案例的描述(施旻廷)**

<h7>(一)截取圖片作業</h7>

<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td><p>使用案例名稱</p></td>
		<td colspan="2"><p>截取圖片作業</p></td>
	</tr>
	<tr>
		<td><p>使用案例描述</p></td>
		<td colspan="2"><p>當使用者欲截取圖時，開啟專案程式並進行截取</p></td>
	</tr>
	<tr>
		<td>主要參與者</td>
		<td colspan="2">使用者</td>
	</tr>
	<tr>
		<td>利害關係人與目標</td>
		<td colspan="2">使用者：能夠正確截取圖片</td>
	</tr>
	<tr>
		<td>前置條件</td>
		<td colspan="2">無</td>
	</tr>
	<tr>
		<td>後置條件</td>
		<td colspan="2">正確截取圖片</td>
	</tr>
	<tr>
		<td rowspan="2">主要成功情節</td>
		<td>參與者</td>
		<td>系統</td>
	</tr>
	<tr>		
		<td><p>1、當使用者欲截取圖片時，開啟系統。</p><p>2、使用者使用滑鼠框出畫面</p></td>
		<td><p>1、系統開啟並啟動擷取畫面</p><p>2、系統取得圖片並顯示圖片設定畫面</p></td>
	</tr>
	<tr>
		<td>例外情節</td>
    	<td colspan="2">如果擷取畫面過大無法放至記憶體，系統自動跳出訊息讓使用者知道。</td>
	</tr>
	<tr>
		<td>其他需求</td>
    	<td colspan="2">無</td>
	</tr>
</table>


<h7>(二)儲存圖片作業</h7>

<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td><p>使用案例名稱</p></td>
		<td colspan="2"><p>儲存圖片作業</p></td>
	</tr>
	<tr>
		<td><p>使用案例描述</p></td>
		<td colspan="2"><p>當使用者截取好畫面後，進行圖片設定及儲存的作業</p></td>
	</tr>
	<tr>
		<td>主要參與者</td>
		<td colspan="2">使用者</td>
	</tr>

	<tr>
		<td>利害關係人與目標</td>
		<td colspan="2">使用者：將欲截取的圖片儲存至電腦</td>
	</tr>
	<tr>
		<td>前置條件</td>
		<td colspan="2">以正確擷取畫面</td>
	</tr>
	<tr>
		<td>後置條件</td>
		<td colspan="2">正確儲存圖片</td>
	</tr>
	<tr>
		<td rowspan="2">主要成功情節</td>
		<td>參與者</td>
		<td>系統</td>
	</tr>
	<tr>		
		<td><p>1、使用者依照自己的喜好將圖片設定成自己想要的格式並儲存(圖片編號, 圖片名稱, 圖片檔案格式, 圖片儲存位置)</p><p>2、使用者依照需求選擇是否繼續截圖</p></td>
		<td><p>1、系統依照使用者的設定並儲存後，顯示是否繼續截圖</p><p>2、選擇「是」回到截圖畫面，選擇「否」回到主畫面</p></td>
	</tr>
	<tr>
		<td>例外情節</td>
    	<td colspan="2">如果儲存的位置不夠圖片容量，系統跳出訊息讓使用者知道。</td>
	</tr>
	<tr>
		<td>其他需求</td>
    	<td colspan="2">無</td>
	</tr>
</table>

<h7>(三) 搜尋已儲存之圖片</h7>

<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td><p>使用案例名稱</p></td>
		<td colspan="2"><p>搜尋已儲存之圖片</p></td>
	</tr>
	<tr>
		<td><p>使用案例描述</p></td>
		<td colspan="2"><p>當系統儲存好圖片後，使用者搜尋圖片</p></td>
	</tr>
	<tr>
		<td>主要參與者</td>
		<td colspan="2">使用者</td>
	</tr>
	<tr>
		<td>利害關係人與目標</td>
		<td colspan="2">使用者：搜尋圖片位置</td>
	</tr>
	<tr>
		<td>前置條件</td>
		<td colspan="2">已儲存圖片</td>
	</tr>
	<tr>
		<td>後置條件</td>
		<td colspan="2">正確尋得已儲存的圖片</td>
	</tr>
	<tr>
		<td rowspan="2">主要成功情節</td>
		<td>參與者</td>
		<td>系統</td>
	</tr>
	<tr>		
		<td><p>1、使用者儲存好圖片後，到電腦裡面搜尋圖片</p></td>
		<td><p>1、系統自動顯示圖片的位置資料夾</p></td>
	</tr>
	<tr>
		<td>例外情節</td>
    	<td colspan="2">無</td>
	</tr>
	<tr>
		<td>其他需求</td>
    	<td colspan="2">無</td>
	</tr>
</table>

<h7>(四)問題回報</h7>

<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td><p>使用案例名稱</p></td>
		<td colspan="2"><p>問題整理及分類作業</p></td>
	</tr>
	<tr>
		<td><p>使用案例描述</p></td>
		<td colspan="2"><p>使用者使用程式後，提供建議或遇到BUG時，提供給專案人員</p></td>
	</tr>
	<tr>
		<td>主要參與者</td>
		<td colspan="2">使用者、程式專案人員</td>
	</tr>
	<tr>
		<td>利害關係人與目標</td>
		<td colspan="2">使用者：提供問題與建議</td>
	</tr>
	<tr>
		<td>前置條件</td>
		<td colspan="2">使用者已使用過程是</td>
	</tr>
	<tr>
		<td>後置條件</td>
		<td colspan="2">無</td>
	</tr>
	<tr>
		<td rowspan="2">主要成功情節</td>
		<td>參與者</td>
		<td>系統</td>
	</tr>
	<tr>		
		<td><p>1、使用者遇到問題或有建議時，到主畫面中的問題回報畫面</p><p>2.使用者將建議或BUG輸入並送出</p></td>
		<td><p>1、系統顯示問題回報的畫面</p><p>2、系統將問題儲存至資料庫</p></td>
	</tr>
	<tr>
		<td>例外情節</td>
    	<td colspan="2">無</td>
	</tr>
	<tr>
		<td>其他需求</td>
    	<td colspan="2">無</td>
	</tr>
</table>

**六：個別使用案例的活動圖(黃俊欽)**

<h7>一、截取圖片作業</h7>
<a href="http://imgur.com/npv5DzN"><img src="http://i.imgur.com/npv5DzN.jpg" title="source: imgur.com" /></a>


<h7>二. 儲存圖片作業</h7>
<a href="http://imgur.com/EMCQS5P"><img src="http://i.imgur.com/EMCQS5P.jpg" title="source: imgur.com" /></a>
