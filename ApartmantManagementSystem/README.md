# Java - MySQL - Swing Library
# Apartmant Management System

APARTMAN(*Apt_No,D_Sayisi,KatSayisi,Aidat)
DAIRE(*DNO,KatNo_D_TelNo,D_KisiSayisi,D_GazAboneNo,SuAboneNo,ElkAboneNo,OdaSayisi,*Apt_No)
KISI(K_TC,D_Tarihi,AdSoyad,Cinsiyet,DNO)

DAIRE(m)<--(1)APARTMAN

DAIRE(1)-->(m)KISI


![Mnu_preview](https://user-images.githubusercontent.com/66293052/109340397-05962000-787a-11eb-8a47-e7f12703079e.png)
![UserLogin_Preview](https://user-images.githubusercontent.com/66293052/109340404-07f87a00-787a-11eb-8b3f-043f0b3ec5c8.png)
![dairegoruntule_preview](https://user-images.githubusercontent.com/66293052/109340412-0a5ad400-787a-11eb-92d3-c89393408811.png)
![kisiekle_preview](https://user-images.githubusercontent.com/66293052/109340419-0b8c0100-787a-11eb-9fa5-73830b2f28d9.png)
![kisigoster_preview](https://user-images.githubusercontent.com/66293052/109340429-0f1f8800-787a-11eb-9fcc-6220d1143df0.png)
