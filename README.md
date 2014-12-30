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

<h7>三. 搜尋已儲存之圖片</h7>
<a href="http://imgur.com/KMIklOm"><img src="http://i.imgur.com/KMIklOm.jpg" title="source: imgur.com" /></a>

<h7>四. 問題回報</h7>
<a href="http://imgur.com/wikjQlT"><img src="http://i.imgur.com/wikjQlT.jpg" title="source: imgur.com" /></a>


**七：名詞與概念類別列舉表**

<h7>(一)截取圖片作業</h7>
<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>名詞</td>
		<td>原因</td>
		<td>結果(是否為概念類別)</td>
	</tr>
	<tr>
		<td>使用者</td>
		<td>有使用本系統需求的人，稱為使用者，所以必須為一個體。</td>
		<td>是</td>
	</tr>
	<tr>
		<td>圖片</td>
		<td>本系統主要目的為截取圖片，所以圖片必須為一個體。</td>
		<td>是</td>
	</tr>
</table>


<h7>(二)儲存圖片作業</h7>

<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>名詞</td>
		<td>原因</td>
		<td>結果(是否為概念類別)</td>
	</tr>
	<tr>
		<td>使用者</td>
		<td>有使用本系統需求的人，稱為使用者，所以必須為一個體</td>
		<td>是</td>
	</tr>
	<tr>
		<td>圖片編號</td>
		<td>為圖片屬性</td>
		<td>否</td>
	</tr>
	<tr>
		<td>圖片名稱</td>
		<td>為圖片屬性</td>
		<td>否</td>
	</tr>
	<tr>
		<td>圖片檔案格式</td>
		<td>為圖片屬性</td>
		<td>否</td>
	</tr>
	<tr>
		<td>圖片儲存位置</td>
		<td>為圖片屬性</td>
		<td>否</td>
	</tr>
</table>


<h7>(三)搜尋已儲存之圖片</h7>

<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>名詞</td>
		<td>原因</td>
		<td>結果(是否為概念類別)</td>
	</tr>
	<tr>
		<td>使用者</td>
		<td>有使用本系統需求的人，稱為使用者，所以必須為一個體。</td>
		<td>是</td>
	</tr>
	<tr>
		<td>圖片儲存位置</td>
		<td>為圖片屬性</td>
		<td>否</td>
	</tr>
</table>


<h7>(四)問題整理及分類作業</h7>


<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>名詞</td>
		<td>原因</td>
		<td>結果(是否為概念類別)</td>
	</tr>
	<tr>
		<td>使用者</td>
		<td>有使用本系統需求的人，稱為使用者，所以必須為一個體。</td>
		<td>是</td>
	</tr>
	<tr>
		<td>專案人員</td>
		<td>維護系統並處理使用者的回應，所以必須為一個體</td>
		<td>是</td>
	</tr>
	<tr>
		<td>問題</td>
		<td>使用者提供的BUG或更好的建議，所以必須為一個體</td>
		<td>是</td>
	</tr>
</table>


**八：個別案例最初的初步類別圖**

<h7>【1.截取圖片作業】</h7>

<a href="http://imgur.com/z7LYHOR"><img src="http://i.imgur.com/z7LYHOR.png" title="source: imgur.com" /></a>

<h7>【2. 儲存圖片作業】</h7>

<a href="http://imgur.com/W3ev1rs"><img src="http://i.imgur.com/W3ev1rs.png" title="source: imgur.com" /></a>

<h7>【3. 搜尋已儲存之圖片】</h7>

<a href="http://imgur.com/P3SZoLM"><img src="http://i.imgur.com/P3SZoLM.png" title="source: imgur.com" /></a>

<h7>【4.問題整理及分類作業】</h7>

<a href="http://imgur.com/XNrvK8K"><img src="http://i.imgur.com/XNrvK8K.png" title="source: imgur.com" /></a>



**九：整個系統的初步類別圖**

<a href="http://imgur.com/FieBv8P"><img src="http://i.imgur.com/FieBv8P.png" title="source: imgur.com" /></a>


**十：使用案例主要成功情節之英文名稱事件對應**

<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="2">使用案例：截取圖片作業</td>
	<tr>
	<tr>
		<td>主要成功情節：<br>
		1.	當使用者要截取畫面圖片，使用者開啟程式<br>
		2.	系統啟動進入主畫面<br>
		3.	使用者點選截取圖片並截取圖片<br>
		4.	系統截取圖片<br>
	</td>
	<td>
		Operating System<br>
		System menu<br>
		catchphoto(length,weight)<br>
		</td>
	</tr>
</table>



<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="2">使用案例：搜尋已儲存之圖片</td>
	<tr>
	<tr>
		<td>主要成功情節：<br>
			1.	儲存好圖片後，使用者尋找已儲存的位置<br>
			2.	系統回到主畫面<br>
			3.	使用者選取圖片位置<br>
			4.	系統開取圖片儲存位置的文件夾<br>
			5.	回到主畫面<br>
		</td>
		<td>
			backtomenu()<br>
			openPhotoLocation()<br>
			backMain()<br>
		</td>
	</tr>
</table>




<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="2">使用案例：問題整理及分類作業</td>
	<tr>
	<tr>
		<td>主要成功情節：<br>
			1.	使用者在使用過程中發現BUG或有一些建議想提供給專案人員，在主畫面選擇BUG回報與建議<br>
			2.	系統開啟問題回報的畫面<br>
			3.	使用者輸入使用者基本資料和問題與建議<br>
			4.	系統確認使用者基本資料是否有誤<br>
			5.	系統送出問題與建議<br>
			6.	回到主畫面<br>
		</td>
		<td>
			Checkuserame(uerName,userEmail)<br>
			sendBug()<br>
		</td>
	</tr>
</table>


**十一：每個名稱事件之合約**

<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>合約: catchphoto()</td>
	</tr>
	<tr>
		<td>操作：catchphoto(length,weight)<br>
		交互參照：截取圖片作業<br>
		前置條件：存在類別Photo之實例newPhoto<br>
		</td>
	</tr>
</table>


<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>合約: photoSettings()</td>
	</tr>
	<tr>
		<td>操作：photoSettings(photoName、photoID)<br>
		交互參照：儲存圖片作業<br>
		前置條件：存在類別Photo之實例newPhoto<br>
		後置條件：根據photo(length,weight)或photoSettings(photoName、photoID)讀取圖片基本資料並存入至類別Photo之屬性中<br>
		</td>
	</tr>
</table>


<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>合約: checkPhoto()</td>
	</tr>
	<tr>
		<td>操作：checkPhoto()<br>
		交互參照：儲存圖片作業<br>
		前置條件：存在類別Photo之實例newPhoto<br>
		後置條件：根據photo(length,weight)和photoSettings(photoName、photoID)尋找Photo實例，並形成關聯<br>
		</td>
	</tr>
</table>

<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>合約: savePhoto ()</td>
	</tr>
	<tr>
		<td>操作：savePhoto()<br>
		交互參照：儲存圖片作業<br>
		前置條件：存在類別savePhoto之實例newsavePhoto<br>
		後置條件：回傳newSavePhoto紀錄至實例photoRec<br>
		</td>
	</tr>
</table>

<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>合約: backMain()</td>
	</tr>
	<tr>
		<td>操作：backMain()<br>
		交互參照：圖片搜尋作業<br>
		前置條件：存在類別Photo之實例photoRec<br>
		後置條件：回到主頁面<br>
		</td>
	</tr>
</table>


<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>合約: openPhotoLocation()</td>
	</tr>
	<tr>
		<td>
		操作：openPhotoLocation()<br>
		交互參照：搜尋已儲存之圖片<br>
		前置條件：存在類別Photo之實例photoRec<br>
		後置條件：回傳photoRec紀錄<br>
		</td>
	</tr>
</table>

<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>合約: checkCName()</td>
	</tr>
	<tr>
		<td>
		操作：checkCName(CustomerName,CustomerEmail)<br>
		交互參照：問題整理及分類作業<br>
		前置條件：存在類別CName之實例checkCName<br>
		後置條件：回傳CName紀錄<br>
		</td>
	</tr>
</table>

<table border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td>合約: sendBug()</td>
	</tr>
	<tr>
		<td>
		操作：sendBug()<br>
		交互參照：問題整理及分類作業<br>
		前置條件：存在類別Bug之實例sendBug<br>
		後置條件：回傳sendBug訊息，傳送BugRec至程式維護人員<br>
		</td>
	</tr>
</table>



**十二：使用案例之系統循序圖**

<h7>【截取圖片作業】之系統循序圖</h7>
<a href="http://imgur.com/Dam8frC"><img src="http://i.imgur.com/Dam8frC.png" title="source: imgur.com" /></a>


<h7>【儲存圖片作業】之系統循序圖</h7>
<a href="http://imgur.com/WO9ADXK"><img src="http://i.imgur.com/WO9ADXK.png" title="source: imgur.com" /></a>

<h7>【搜尋已儲存之圖片】之系統循序圖</h7>
<a href="http://imgur.com/QBRqPTv"><img src="http://i.imgur.com/QBRqPTv.png" title="source: imgur.com" /></a>

<h7>【問題整理及分類作業】之系統循序圖</h7>
<a href="http://imgur.com/OseBT13"><img src="http://i.imgur.com/OseBT13.png" title="source: imgur.com" /></a>