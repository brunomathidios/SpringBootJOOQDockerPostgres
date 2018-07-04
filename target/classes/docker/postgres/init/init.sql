--drop database delivery;

CREATE SEQUENCE public.delivery_user_id_user_seq;
CREATE SEQUENCE public.delivery_restaurant_id_restaurant_seq;
CREATE SEQUENCE public.delivery_product_id_product_seq;
CREATE SEQUENCE public.delivery_order_id_order_seq;
CREATE SEQUENCE public.delivery_order_product_id_order_product_seq;

CREATE TABLE public.delivery_user
(
    id_user integer NOT NULL DEFAULT nextval('delivery_user_id_user_seq'::regclass),
    nm_user character varying(150) COLLATE pg_catalog."default" NOT NULL,
    login_user character varying(20) COLLATE pg_catalog."default",
    pwd_user character varying COLLATE pg_catalog."default",
    CONSTRAINT pk_user PRIMARY KEY (id_user)
);

CREATE TABLE public.delivery_restaurant
(
    id_restaurant integer NOT NULL DEFAULT nextval('delivery_restaurant_id_restaurant_seq'::regclass),
    nm_restaurant character varying(50) COLLATE pg_catalog."default",
    CONSTRAINT pk_restaurant PRIMARY KEY (id_restaurant)
);

CREATE TABLE public.delivery_product
(
    id_product integer NOT NULL DEFAULT nextval('delivery_product_id_product_seq'::regclass),
    nm_product character varying(50) COLLATE pg_catalog."default" NOT NULL,
    id_restaurant integer NOT NULL,
    price_product double precision,
    CONSTRAINT pk_product PRIMARY KEY (id_product),
    CONSTRAINT fk_restaurante FOREIGN KEY (id_restaurant)
        REFERENCES public.delivery_restaurant (id_restaurant) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE public.delivery_order
(
    id_order integer NOT NULL DEFAULT nextval('delivery_order_id_order_seq'::regclass),
    id_restaurant integer NOT NULL,
    id_user integer NOT NULL,
    in_status_order character varying(10) COLLATE pg_catalog."default" NOT NULL,
    dt_order timestamp without time zone,
    dt_cancel timestamp without time zone,
    CONSTRAINT pk_order PRIMARY KEY (id_order),
    CONSTRAINT fk_restaurante FOREIGN KEY (id_restaurant)
        REFERENCES public.delivery_restaurant (id_restaurant) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_user FOREIGN KEY (id_user)
        REFERENCES public.delivery_user (id_user) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

CREATE TABLE public.delivery_order_product
(
    id_order_product integer NOT NULL DEFAULT nextval('delivery_order_product_id_order_product_seq'::regclass),
    id_order integer NOT NULL,
    id_product integer NOT NULL,
    CONSTRAINT pk_order_product PRIMARY KEY (id_order_product),
    CONSTRAINT fk_order FOREIGN KEY (id_order)
        REFERENCES public.delivery_order (id_order) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_product FOREIGN KEY (id_product)
        REFERENCES public.delivery_product (id_product) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);
