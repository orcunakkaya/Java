# Java - MySQL - Swing Library
# Apartmant Management System

APARTMAN(*Apt_No,D_Sayisi,KatSayisi,Aidat)
DAIRE(*DNO,KatNo_D_TelNo,D_KisiSayisi,D_GazAboneNo,SuAboneNo,ElkAboneNo,OdaSayisi,*Apt_No)
KISI(K_TC,D_Tarihi,AdSoyad,Cinsiyet,DNO)

DAIRE(m)<--(1)APARTMAN
DAIRE(1)-->(m)KISI
