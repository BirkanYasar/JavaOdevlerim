杇瑣   < V  HesapMak  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 
LHesapMak; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   'Birinci say覺 de��erini tu��lay覺n覺z: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , &襤kini say覺 de��erini tu��lay覺n覺z : . [L羹tfen yapmak isted��iniz i��lemi tu��lay覺n覺z: 
1)Toplama
2)��覺karma
3)��arpma
4)B繹lme
  0 1 2 nextByte ()B 4 java/lang/StringBuilder 6 Toplam :
 3 8  &
 3 : ; < append (I)Ljava/lang/StringBuilder;
 3 > ? @ toString ()Ljava/lang/String; B Fark :  D 
��arp覺m : F 	B繹l羹m : H Hatal覺 Giri�� yapt覺n覺z! args [Ljava/lang/String; scan Ljava/util/Scanner; a I b process B StackMapTable J 
SourceFile HesapMak.java !               /     *� �    
                    	      |     伒 Y� � L� � !+� '=� +� !+� '>� -� !+� /6�     �            :   U   p� � 3Y5� 7`� 9� =� !� \� � 3YA� 7d� 9� =� !� A� � 3YC� 7h� 9� =� !� &� � 3YE� 7l� 9� =� !� � G� !�    
   J      
        %  -  3  T  l   o " � # � % � & � ( � ) � + � .    4    � I J    � K L   � M N  % � O N  3 � P Q  R    � T  S     T    U