package ru.leymooo.botfilter.caching;

import lombok.experimental.UtilityClass;

/**
 * @author Leymooo
 */
@UtilityClass
public final class PacketsPosition
{

    public int LOGIN = 0;
    public int CHUNK = 1;
    public int TIME = 2;
    public int PLAYERABILITIES = 3;
    public int PLAYERPOSANDLOOK_CAPTCHA = 4;
    public int SETSLOT_MAP = 5;
    public int SETSLOT_RESET = 6;
    public int KEEPALIVE = 7;
    public int PLAYERPOSANDLOOK = 8;
    public int SETEXP_RESET = 9;
    public int PLUGIN_MESSAGE = 10;

    public int MODERN_SETSLOT_MAP = 11;
    public int MODERN_SETSLOT_RESET = 12;

    public int CAPTCHA_FAILED_2_MSG = 0;
    public int CAPTCHA_FAILED_1_MSG = 1;
    public int CHECKING_MSG = 2;
    public int CHECKING_CAPTCHA_MSG = 3;
    public int CHECK_SUS_MSG = 4;

}
