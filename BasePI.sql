PGDMP         7                {         
   ProyectoPI    15.3    15.3                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            	           1262    24643 
   ProyectoPI    DATABASE     �   CREATE DATABASE "ProyectoPI" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Colombia.1252';
    DROP DATABASE "ProyectoPI";
                postgres    false            �            1259    24694    equipo    TABLE     �  CREATE TABLE public.equipo (
    codigodeequipo character varying(50) NOT NULL,
    responsable character varying(50),
    frecuenciamantenimiento character varying(50),
    ultimomantenimiento character varying(50),
    proximomantenimiento character varying(50),
    ubicacionactual character varying(50),
    fechadecompra character varying(50),
    estado character varying(150)
);
    DROP TABLE public.equipo;
       public         heap    postgres    false            �            1259    32919 	   prestamos    TABLE     ^  CREATE TABLE public.prestamos (
    codigo character varying(50) NOT NULL,
    nombredelresponsable character varying(50) NOT NULL,
    fechadesalida character varying(50),
    fechaderetorno character varying(50),
    lugardedestino character varying(50),
    estadodelequipo character varying(50),
    actividadesarealizar character varying(50)
);
    DROP TABLE public.prestamos;
       public         heap    postgres    false            �            1259    24654    usuarios    TABLE     K  CREATE TABLE public.usuarios (
    nombre character varying(20),
    apellido character varying(20),
    nick character varying(20) NOT NULL,
    "contraseña" character varying(20),
    domicilio character varying(20),
    telefono character varying(20),
    correo character varying(80),
    tipousuario character varying(20)
);
    DROP TABLE public.usuarios;
       public         heap    postgres    false                      0    24694    equipo 
   TABLE DATA           �   COPY public.equipo (codigodeequipo, responsable, frecuenciamantenimiento, ultimomantenimiento, proximomantenimiento, ubicacionactual, fechadecompra, estado) FROM stdin;
    public          postgres    false    215   �                 0    32919 	   prestamos 
   TABLE DATA           �   COPY public.prestamos (codigo, nombredelresponsable, fechadesalida, fechaderetorno, lugardedestino, estadodelequipo, actividadesarealizar) FROM stdin;
    public          postgres    false    216   �                 0    24654    usuarios 
   TABLE DATA           s   COPY public.usuarios (nombre, apellido, nick, "contraseña", domicilio, telefono, correo, tipousuario) FROM stdin;
    public          postgres    false    214   �       o           2606    24700    equipo equipo_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.equipo
    ADD CONSTRAINT equipo_pkey PRIMARY KEY (codigodeequipo);
 <   ALTER TABLE ONLY public.equipo DROP CONSTRAINT equipo_pkey;
       public            postgres    false    215            q           2606    32930    prestamos prestamos_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.prestamos
    ADD CONSTRAINT prestamos_pkey PRIMARY KEY (codigo);
 B   ALTER TABLE ONLY public.prestamos DROP CONSTRAINT prestamos_pkey;
       public            postgres    false    216            m           2606    24658    usuarios usuarios_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (nick);
 @   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT usuarios_pkey;
       public            postgres    false    214            r           2606    32924    prestamos prestamos_codigo_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.prestamos
    ADD CONSTRAINT prestamos_codigo_fkey FOREIGN KEY (codigo) REFERENCES public.equipo(codigodeequipo);
 I   ALTER TABLE ONLY public.prestamos DROP CONSTRAINT prestamos_codigo_fkey;
       public          postgres    false    216    215    3183               �   x����
!�>�O9��]���]�ucWCנ��":(]����@�c����63P¡����4,ׄ�2�}GvL~f��A`^��\��"0�
�􎊜qL-ӛ=�Ylz4�t�׆֚j|�j���#s�HI�q����m�  �	��qi!������2���ӆs�!���         R   x�362��*��L��42QHIU�*����4�0s�L���DN���<���Ĕ|����".�\�277��ͅ ����� ��x           x���An� E��=��ZE��,������i3�tl|��8U�M�-�����'��	(LJ)�i��l��H~���+� ��>F`J�V��w��w>���.A.	���P�.��pĄC�
���L����[+{g�[�:f���Ӧ���҅���^$ܔ��V9�S>��n��_��G�鳦�JԾC�9]a�/4��E�5D<{'�*��
a�u���)m:+����/��5��<M���,�Z9}GZot'MWsg���"�o�����     