------------------------------------
-- Grants for Videos.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on MUSIC_VIDEO to role_admin;
grant select, insert, update, delete on SEASON to role_admin;
grant select, insert, update, delete on SHORT_FILM to role_admin;
grant select, insert, update, delete on TV_SHOW to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on MUSIC_VIDEO to role_polisher;
grant select, update on SEASON to role_polisher;
grant select, update on SHORT_FILM to role_polisher;
grant select, update on TV_SHOW to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on MUSIC_VIDEO to role_content_provider;
grant select on SEASON to role_content_provider;
grant select on SHORT_FILM to role_content_provider;
grant select on TV_SHOW to role_content_provider;

------------------------------------
-- Grants for Assets.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on ASSET to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on ASSET to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on ASSET to role_content_provider;

------------------------------------
-- Grants for Studios.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on STUDIO to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on STUDIO to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on STUDIO to role_content_provider;

------------------------------------
-- Grants for Products.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on PRODUCT to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on PRODUCT to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on PRODUCT to role_content_provider;

------------------------------------
-- Grants for Podcasts.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on PODCAST to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on PODCAST to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on PODCAST to role_content_provider;

------------------------------------
-- Grants for Playlists.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on PLAYLIST to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on PLAYLIST to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on PLAYLIST to role_content_provider;

------------------------------------
-- Grants for Playlists.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on PLAYLIST to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on PLAYLIST to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on PLAYLIST to role_content_provider;

------------------------------------
-- Grants for Music.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on ARTIST_COLLABORATION to role_admin;
grant select, insert, update, delete on ARTIST_GROUP to role_admin;
grant select, insert, update, delete on BOX_SET to role_admin;
grant select, insert, update, delete on BOX_SET_PLAYLIST to role_admin;
grant select, insert, update, delete on COMPOSER to role_admin;
grant select, insert, update, delete on GENRE to role_admin;
grant select, insert, update, delete on PARENTAL_ADVISORY to role_admin;
grant select, insert, update, delete on SONG to role_admin;
grant select, insert, update, delete on SONG_COMPOSER to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on ARTIST_COLLABORATION to role_polisher;
grant select, update on ARTIST_GROUP to role_polisher;
grant select, update on BOX_SET to role_polisher;
grant select, update on BOX_SET_PLAYLIST to role_polisher;
grant select, update on COMPOSER to role_polisher;
grant select, update on GENRE to role_polisher;
grant select, update on PARENTAL_ADVISORY to role_polisher;
grant select, update on SONG to role_polisher;
grant select, update on SONG_COMPOSER to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on ARTIST_COLLABORATION to role_content_provider;
grant select on ARTIST_GROUP to role_content_provider;
grant select on BOX_SET to role_content_provider;
grant select on BOX_SET_PLAYLIST to role_content_provider;
grant select on COMPOSER to role_content_provider;
grant select on GENRE to role_content_provider;
grant select on PARENTAL_ADVISORY to role_content_provider;
grant select on SONG to role_content_provider;
grant select on SONG_COMPOSER to role_content_provider;

------------------------------------
-- Grants for Languages.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on LANGUAGE to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on LANGUAGE to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on LANGUAGE to role_content_provider;

------------------------------------
-- Grants for Labels.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on LABEL to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on LABEL to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on LABEL to role_content_provider;

------------------------------------
-- Grants for Episodes.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on EPISODE to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on EPISODE to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on EPISODE to role_content_provider;

------------------------------------
-- Grants for Commerce.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on COUNTRY to role_admin;
grant select, insert, update, delete on COUNTRY_LANGUAGE to role_admin;
grant select, insert, update, delete on CURRENCY to role_admin;
grant select, insert, update, delete on STORE to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on COUNTRY to role_polisher;
grant select, update on COUNTRY_LANGUAGE to role_polisher;
grant select, update on CURRENCY to role_polisher;
grant select, update on STORE to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on COUNTRY to role_content_provider;
grant select on COUNTRY_LANGUAGE to role_content_provider;
grant select on CURRENCY to role_content_provider;
grant select on STORE to role_content_provider;

------------------------------------
-- Grants for AudioBooks.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on AUDIO_BOOK to role_admin;
grant select, insert, update, delete on AUDIO_BOOK_AUTHOR to role_admin;
grant select, insert, update, delete on AUDIO_BOOK_CATEGORY to role_admin;
grant select, insert, update, delete on AUTHOR to role_admin;
grant select, insert, update, delete on CATEGORY to role_admin;
grant select, insert, update, delete on PROVIDER to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on AUDIO_BOOK to role_polisher;
grant select, update on AUDIO_BOOK_AUTHOR to role_polisher;
grant select, update on AUDIO_BOOK_CATEGORY to role_polisher;
grant select, update on AUTHOR to role_polisher;
grant select, update on CATEGORY to role_polisher;
grant select, update on PROVIDER to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on AUDIO_BOOK to role_content_provider;
grant select on AUDIO_BOOK_AUTHOR to role_content_provider;
grant select on AUDIO_BOOK_CATEGORY to role_content_provider;
grant select on AUTHOR to role_content_provider;
grant select on CATEGORY to role_content_provider;
grant select on PROVIDER to role_content_provider;

------------------------------------
-- Grants for Artists.eomodeld
------------------------------------

-- Grant complete access to ravi & max
grant select, insert, update, delete on ARTIST to role_admin;

-- Grant update access to polishers, e.g. eric
grant select, update on ARTIST to role_polisher;

-- Grant read access to content providers, e.g. sony
grant select on ARTIST to role_content_provider;