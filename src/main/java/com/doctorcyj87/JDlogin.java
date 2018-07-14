package com.doctorcyj87;

import com.eclipsesource.v8.V8;

import java.io.*;

/**
 * @Author: DoctorCYJ
 * @Date: 2018/6/27 18:01
 * @Description: J2V8引擎执行京东密码加密过程
 */
public class JDlogin {

    public static void main(String[] args) throws IOException {
        V8 v8 = V8.createV8Runtime();
        String js = "\n" +
                "(function(a, b) {\n" +
                "    if (typeof define === \"function\" && define.amd) {\n" +
                "        define([\"exports\"], b)\n" +
                "    } else {\n" +
                "        if (typeof exports === \"object\" && typeof exports.nodeName !== \"string\") {\n" +
                "            b(module.exports)\n" +
                "        } else {\n" +
                "            b(a)\n" +
                "        }\n" +
                "    }\n" +
                "})(this,\n" +
                "function(ap) {\n" +
                "\tvar cyjcyj = new Object;  //自定义一个对象\n" +
                "    var bE;\n" +
                "    var n = 244837814094590;\n" +
                "    var aV = ((n & 16777215) == 15715070);\n" +
                "    function bf(z, t, L) {\n" +
                "        if (z != null) {\n" +
                "            if (\"number\" == typeof z) {\n" +
                "                this.fromNumber(z, t, L)\n" +
                "            } else {\n" +
                "                if (t == null && \"string\" != typeof z) {\n" +
                "                    this.fromString(z, 256)\n" +
                "                } else {\n" +
                "                    this.fromString(z, t)\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    function bm() {\n" +
                "        return new bf(null)\n" +
                "    }\n" +
                "    function a7(bX, t, z, bW, bZ, bY) {\n" +
                "        while (--bY >= 0) {\n" +
                "            var L = t * this[bX++] + z[bW] + bZ;\n" +
                "            bZ = Math.floor(L / 67108864);\n" +
                "            z[bW++] = L & 67108863\n" +
                "        }\n" +
                "        return bZ\n" +
                "    }\n" +
                "    function a6(bX, b2, b3, bW, b0, t) {\n" +
                "        var bZ = b2 & 32767,\n" +
                "        b1 = b2 >> 15;\n" +
                "        while (--t >= 0) {\n" +
                "            var L = this[bX] & 32767;\n" +
                "            var bY = this[bX++] >> 15;\n" +
                "            var z = b1 * L + bY * bZ;\n" +
                "            L = bZ * L + ((z & 32767) << 15) + b3[bW] + (b0 & 1073741823);\n" +
                "            b0 = (L >>> 30) + (z >>> 15) + b1 * bY + (b0 >>> 30);\n" +
                "            b3[bW++] = L & 1073741823\n" +
                "        }\n" +
                "        return b0\n" +
                "    }\n" +
                "    function a5(bX, b2, b3, bW, b0, t) {\n" +
                "        var bZ = b2 & 16383,\n" +
                "        b1 = b2 >> 14;\n" +
                "        while (--t >= 0) {\n" +
                "            var L = this[bX] & 16383;\n" +
                "            var bY = this[bX++] >> 14;\n" +
                "            var z = b1 * L + bY * bZ;\n" +
                "            L = bZ * L + ((z & 16383) << 14) + b3[bW] + b0;\n" +
                "            b0 = (L >> 28) + (z >> 14) + b1 * bY;\n" +
                "            b3[bW++] = L & 268435455\n" +
                "        }\n" +
                "        return b0\n" +
                "    }\n" +
                "\n" +
                "            bf.prototype.am = a7;\n" +
                "            bE = 26;\n" +
                "\n" +
                "    bf.prototype.DB = bE;\n" +
                "    bf.prototype.DM = ((1 << bE) - 1);\n" +
                "    bf.prototype.DV = (1 << bE);\n" +
                "    var bQ = 52;\n" +
                "    bf.prototype.FV = Math.pow(2, bQ);\n" +
                "    bf.prototype.F1 = bQ - bE;\n" +
                "    bf.prototype.F2 = 2 * bE - bQ;\n" +
                "    var a = \"0123456789abcdefghijklmnopqrstuvwxyz\";\n" +
                "    var g = new Array();\n" +
                "    var aH, E;\n" +
                "    aH = \"0\".charCodeAt(0);\n" +
                "    for (E = 0; E <= 9; ++E) {\n" +
                "        g[aH++] = E\n" +
                "    }\n" +
                "    aH = \"a\".charCodeAt(0);\n" +
                "    for (E = 10; E < 36; ++E) {\n" +
                "        g[aH++] = E\n" +
                "    }\n" +
                "    aH = \"A\".charCodeAt(0);\n" +
                "    for (E = 10; E < 36; ++E) {\n" +
                "        g[aH++] = E\n" +
                "    }\n" +
                "    function Y(t) {\n" +
                "        return a.charAt(t)\n" +
                "    }\n" +
                "    function aX(z, t) {\n" +
                "        var L = g[z.charCodeAt(t)];\n" +
                "        return (L == null) ? -1 : L\n" +
                "    }\n" +
                "    function d(z) {\n" +
                "        for (var t = this.t - 1; t >= 0; --t) {\n" +
                "            z[t] = this[t]\n" +
                "        }\n" +
                "        z.t = this.t;\n" +
                "        z.s = this.s\n" +
                "    }\n" +
                "    function h(t) {\n" +
                "        this.t = 1;\n" +
                "        this.s = (t < 0) ? -1 : 0;\n" +
                "        if (t > 0) {\n" +
                "            this[0] = t\n" +
                "        } else {\n" +
                "            if (t < -1) {\n" +
                "                this[0] = t + this.DV\n" +
                "            } else {\n" +
                "                this.t = 0\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    function bi(t) {\n" +
                "        var z = bm();\n" +
                "        z.fromInt(t);\n" +
                "        return z\n" +
                "    }\n" +
                "    function bI(bZ, z) {\n" +
                "        var bW;\n" +
                "        if (z == 16) {\n" +
                "            bW = 4\n" +
                "        } else {\n" +
                "            if (z == 8) {\n" +
                "                bW = 3\n" +
                "            } else {\n" +
                "                if (z == 256) {\n" +
                "                    bW = 8\n" +
                "                } else {\n" +
                "                    if (z == 2) {\n" +
                "                        bW = 1\n" +
                "                    } else {\n" +
                "                        if (z == 32) {\n" +
                "                            bW = 5\n" +
                "                        } else {\n" +
                "                            if (z == 4) {\n" +
                "                                bW = 2\n" +
                "                            } else {\n" +
                "                                this.fromRadix(bZ, z);\n" +
                "                                return\n" +
                "                            }\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        this.t = 0;\n" +
                "        this.s = 0;\n" +
                "        var bY = bZ.length,\n" +
                "        L = false,\n" +
                "        bX = 0;\n" +
                "        while (--bY >= 0) {\n" +
                "            var t = (bW == 8) ? bZ[bY] & 255 : aX(bZ, bY);\n" +
                "            if (t < 0) {\n" +
                "                if (bZ.charAt(bY) == \"-\") {\n" +
                "                    L = true\n" +
                "                }\n" +
                "                continue\n" +
                "            }\n" +
                "            L = false;\n" +
                "            if (bX == 0) {\n" +
                "                this[this.t++] = t\n" +
                "            } else {\n" +
                "                if (bX + bW > this.DB) {\n" +
                "                    this[this.t - 1] |= (t & ((1 << (this.DB - bX)) - 1)) << bX;\n" +
                "                    this[this.t++] = (t >> (this.DB - bX))\n" +
                "                } else {\n" +
                "                    this[this.t - 1] |= t << bX\n" +
                "                }\n" +
                "            }\n" +
                "            bX += bW;\n" +
                "            if (bX >= this.DB) {\n" +
                "                bX -= this.DB\n" +
                "            }\n" +
                "        }\n" +
                "        if (bW == 8 && (bZ[0] & 128) != 0) {\n" +
                "            this.s = -1;\n" +
                "            if (bX > 0) {\n" +
                "                this[this.t - 1] |= ((1 << (this.DB - bX)) - 1) << bX\n" +
                "            }\n" +
                "        }\n" +
                "        this.clamp();\n" +
                "        if (L) {\n" +
                "            bf.ZERO.subTo(this, this)\n" +
                "        }\n" +
                "    }\n" +
                "    function bA() {\n" +
                "        var t = this.s & this.DM;\n" +
                "        while (this.t > 0 && this[this.t - 1] == t) {--this.t\n" +
                "        }\n" +
                "    }\n" +
                "    function u(z) {\n" +
                "        if (this.s < 0) {\n" +
                "            return \"-\" + this.negate().toString(z)\n" +
                "        }\n" +
                "        var L;\n" +
                "        if (z == 16) {\n" +
                "            L = 4\n" +
                "        } else {\n" +
                "            if (z == 8) {\n" +
                "                L = 3\n" +
                "            } else {\n" +
                "                if (z == 2) {\n" +
                "                    L = 1\n" +
                "                } else {\n" +
                "                    if (z == 32) {\n" +
                "                        L = 5\n" +
                "                    } else {\n" +
                "                        if (z == 4) {\n" +
                "                            L = 2\n" +
                "                        } else {\n" +
                "                            return this.toRadix(z)\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        var bX = (1 << L) - 1,\n" +
                "        b0,\n" +
                "        t = false,\n" +
                "        bY = \"\",\n" +
                "        bW = this.t;\n" +
                "        var bZ = this.DB - (bW * this.DB) % L;\n" +
                "        if (bW-->0) {\n" +
                "            if (bZ < this.DB && (b0 = this[bW] >> bZ) > 0) {\n" +
                "                t = true;\n" +
                "                bY = Y(b0)\n" +
                "            }\n" +
                "            while (bW >= 0) {\n" +
                "                if (bZ < L) {\n" +
                "                    b0 = (this[bW] & ((1 << bZ) - 1)) << (L - bZ);\n" +
                "                    b0 |= this[--bW] >> (bZ += this.DB - L)\n" +
                "                } else {\n" +
                "                    b0 = (this[bW] >> (bZ -= L)) & bX;\n" +
                "                    if (bZ <= 0) {\n" +
                "                        bZ += this.DB; --bW\n" +
                "                    }\n" +
                "                }\n" +
                "                if (b0 > 0) {\n" +
                "                    t = true\n" +
                "                }\n" +
                "                if (t) {\n" +
                "                    bY += Y(b0)\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        return t ? bY: \"0\"\n" +
                "    }\n" +
                "    function bC() {\n" +
                "        var t = bm();\n" +
                "        bf.ZERO.subTo(this, t);\n" +
                "        return t\n" +
                "    }\n" +
                "    function bB() {\n" +
                "        return (this.s < 0) ? this.negate() : this\n" +
                "    }\n" +
                "    function bN(t) {\n" +
                "        var L = this.s - t.s;\n" +
                "        if (L != 0) {\n" +
                "            return L\n" +
                "        }\n" +
                "        var z = this.t;\n" +
                "        L = z - t.t;\n" +
                "        if (L != 0) {\n" +
                "            return (this.s < 0) ? -L: L\n" +
                "        }\n" +
                "        while (--z >= 0) {\n" +
                "            if ((L = this[z] - t[z]) != 0) {\n" +
                "                return L\n" +
                "            }\n" +
                "        }\n" +
                "        return 0\n" +
                "    }\n" +
                "    function q(z) {\n" +
                "        var bW = 1,\n" +
                "        L;\n" +
                "        if ((L = z >>> 16) != 0) {\n" +
                "            z = L;\n" +
                "            bW += 16\n" +
                "        }\n" +
                "        if ((L = z >> 8) != 0) {\n" +
                "            z = L;\n" +
                "            bW += 8\n" +
                "        }\n" +
                "        if ((L = z >> 4) != 0) {\n" +
                "            z = L;\n" +
                "            bW += 4\n" +
                "        }\n" +
                "        if ((L = z >> 2) != 0) {\n" +
                "            z = L;\n" +
                "            bW += 2\n" +
                "        }\n" +
                "        if ((L = z >> 1) != 0) {\n" +
                "            z = L;\n" +
                "            bW += 1\n" +
                "        }\n" +
                "        return bW\n" +
                "    }\n" +
                "    function bt() {\n" +
                "        if (this.t <= 0) {\n" +
                "            return 0\n" +
                "        }\n" +
                "        return this.DB * (this.t - 1) + q(this[this.t - 1] ^ (this.s & this.DM))\n" +
                "    }\n" +
                "    function bv(L, z) {\n" +
                "        var t;\n" +
                "        for (t = this.t - 1; t >= 0; --t) {\n" +
                "            z[t + L] = this[t]\n" +
                "        }\n" +
                "        for (t = L - 1; t >= 0; --t) {\n" +
                "            z[t] = 0\n" +
                "        }\n" +
                "        z.t = this.t + L;\n" +
                "        z.s = this.s\n" +
                "    }\n" +
                "    function a2(L, z) {\n" +
                "        for (var t = L; t < this.t; ++t) {\n" +
                "            z[t - L] = this[t]\n" +
                "        }\n" +
                "        z.t = Math.max(this.t - L, 0);\n" +
                "        z.s = this.s\n" +
                "    }\n" +
                "    function s(b0, bW) {\n" +
                "        var z = b0 % this.DB;\n" +
                "        var t = this.DB - z;\n" +
                "        var bY = (1 << t) - 1;\n" +
                "        var bX = Math.floor(b0 / this.DB),\n" +
                "        bZ = (this.s << z) & this.DM,\n" +
                "        L;\n" +
                "        for (L = this.t - 1; L >= 0; --L) {\n" +
                "            bW[L + bX + 1] = (this[L] >> t) | bZ;\n" +
                "            bZ = (this[L] & bY) << z\n" +
                "        }\n" +
                "        for (L = bX - 1; L >= 0; --L) {\n" +
                "            bW[L] = 0\n" +
                "        }\n" +
                "        bW[bX] = bZ;\n" +
                "        bW.t = this.t + bX + 1;\n" +
                "        bW.s = this.s;\n" +
                "        bW.clamp()\n" +
                "    }\n" +
                "    function bT(bZ, bW) {\n" +
                "        bW.s = this.s;\n" +
                "        var bX = Math.floor(bZ / this.DB);\n" +
                "        if (bX >= this.t) {\n" +
                "            bW.t = 0;\n" +
                "            return\n" +
                "        }\n" +
                "        var z = bZ % this.DB;\n" +
                "        var t = this.DB - z;\n" +
                "        var bY = (1 << z) - 1;\n" +
                "        bW[0] = this[bX] >> z;\n" +
                "        for (var L = bX + 1; L < this.t; ++L) {\n" +
                "            bW[L - bX - 1] |= (this[L] & bY) << t;\n" +
                "            bW[L - bX] = this[L] >> z\n" +
                "        }\n" +
                "        if (z > 0) {\n" +
                "            bW[this.t - bX - 1] |= (this.s & bY) << t\n" +
                "        }\n" +
                "        bW.t = this.t - bX;\n" +
                "        bW.clamp()\n" +
                "    }\n" +
                "    function bs(z, bW) {\n" +
                "        var L = 0,\n" +
                "        bX = 0,\n" +
                "        t = Math.min(z.t, this.t);\n" +
                "        while (L < t) {\n" +
                "            bX += this[L] - z[L];\n" +
                "            bW[L++] = bX & this.DM;\n" +
                "            bX >>= this.DB\n" +
                "        }\n" +
                "        if (z.t < this.t) {\n" +
                "            bX -= z.s;\n" +
                "            while (L < this.t) {\n" +
                "                bX += this[L];\n" +
                "                bW[L++] = bX & this.DM;\n" +
                "                bX >>= this.DB\n" +
                "            }\n" +
                "            bX += this.s\n" +
                "        } else {\n" +
                "            bX += this.s;\n" +
                "            while (L < z.t) {\n" +
                "                bX -= z[L];\n" +
                "                bW[L++] = bX & this.DM;\n" +
                "                bX >>= this.DB\n" +
                "            }\n" +
                "            bX -= z.s\n" +
                "        }\n" +
                "        bW.s = (bX < 0) ? -1 : 0;\n" +
                "        if (bX < -1) {\n" +
                "            bW[L++] = this.DV + bX\n" +
                "        } else {\n" +
                "            if (bX > 0) {\n" +
                "                bW[L++] = bX\n" +
                "            }\n" +
                "        }\n" +
                "        bW.t = L;\n" +
                "        bW.clamp()\n" +
                "    }\n" +
                "    function bJ(z, bW) {\n" +
                "        var t = this.abs(),\n" +
                "        bX = z.abs();\n" +
                "        var L = t.t;\n" +
                "        bW.t = L + bX.t;\n" +
                "        while (--L >= 0) {\n" +
                "            bW[L] = 0\n" +
                "        }\n" +
                "        for (L = 0; L < bX.t; ++L) {\n" +
                "            bW[L + t.t] = t.am(0, bX[L], bW, L, 0, t.t)\n" +
                "        }\n" +
                "        bW.s = 0;\n" +
                "        bW.clamp();\n" +
                "        if (this.s != z.s) {\n" +
                "            bf.ZERO.subTo(bW, bW)\n" +
                "        }\n" +
                "    }\n" +
                "    function au(L) {\n" +
                "        var t = this.abs();\n" +
                "        var z = L.t = 2 * t.t;\n" +
                "        while (--z >= 0) {\n" +
                "            L[z] = 0\n" +
                "        }\n" +
                "        for (z = 0; z < t.t - 1; ++z) {\n" +
                "            var bW = t.am(z, t[z], L, 2 * z, 0, 1);\n" +
                "            if ((L[z + t.t] += t.am(z + 1, 2 * t[z], L, 2 * z + 1, bW, t.t - z - 1)) >= t.DV) {\n" +
                "                L[z + t.t] -= t.DV;\n" +
                "                L[z + t.t + 1] = 1\n" +
                "            }\n" +
                "        }\n" +
                "        if (L.t > 0) {\n" +
                "            L[L.t - 1] += t.am(z, t[z], L, 2 * z, 0, 1)\n" +
                "        }\n" +
                "        L.s = 0;\n" +
                "        L.clamp()\n" +
                "    }\n" +
                "    function a9(b3, b0, bZ) {\n" +
                "        var b9 = b3.abs();\n" +
                "        if (b9.t <= 0) {\n" +
                "            return\n" +
                "        }\n" +
                "        var b1 = this.abs();\n" +
                "        if (b1.t < b9.t) {\n" +
                "            if (b0 != null) {\n" +
                "                b0.fromInt(0)\n" +
                "            }\n" +
                "            if (bZ != null) {\n" +
                "                this.copyTo(bZ)\n" +
                "            }\n" +
                "            return\n" +
                "        }\n" +
                "        if (bZ == null) {\n" +
                "            bZ = bm()\n" +
                "        }\n" +
                "        var bX = bm(),\n" +
                "        z = this.s,\n" +
                "        b2 = b3.s;\n" +
                "        var b8 = this.DB - q(b9[b9.t - 1]);\n" +
                "        if (b8 > 0) {\n" +
                "            b9.lShiftTo(b8, bX);\n" +
                "            b1.lShiftTo(b8, bZ)\n" +
                "        } else {\n" +
                "            b9.copyTo(bX);\n" +
                "            b1.copyTo(bZ)\n" +
                "        }\n" +
                "        var b5 = bX.t;\n" +
                "        var L = bX[b5 - 1];\n" +
                "        if (L == 0) {\n" +
                "            return\n" +
                "        }\n" +
                "        var b4 = L * (1 << this.F1) + ((b5 > 1) ? bX[b5 - 2] >> this.F2: 0);\n" +
                "        var cc = this.FV / b4,\n" +
                "        cb = (1 << this.F1) / b4,\n" +
                "        ca = 1 << this.F2;\n" +
                "        var b7 = bZ.t,\n" +
                "        b6 = b7 - b5,\n" +
                "        bY = (b0 == null) ? bm() : b0;\n" +
                "        bX.dlShiftTo(b6, bY);\n" +
                "        if (bZ.compareTo(bY) >= 0) {\n" +
                "            bZ[bZ.t++] = 1;\n" +
                "            bZ.subTo(bY, bZ)\n" +
                "        }\n" +
                "        bf.ONE.dlShiftTo(b5, bY);\n" +
                "        bY.subTo(bX, bX);\n" +
                "        while (bX.t < b5) {\n" +
                "            bX[bX.t++] = 0\n" +
                "        }\n" +
                "        while (--b6 >= 0) {\n" +
                "            var bW = (bZ[--b7] == L) ? this.DM: Math.floor(bZ[b7] * cc + (bZ[b7 - 1] + ca) * cb);\n" +
                "            if ((bZ[b7] += bX.am(0, bW, bZ, b6, 0, b5)) < bW) {\n" +
                "                bX.dlShiftTo(b6, bY);\n" +
                "                bZ.subTo(bY, bZ);\n" +
                "                while (bZ[b7] < --bW) {\n" +
                "                    bZ.subTo(bY, bZ)\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        if (b0 != null) {\n" +
                "            bZ.drShiftTo(b5, b0);\n" +
                "            if (z != b2) {\n" +
                "                bf.ZERO.subTo(b0, b0)\n" +
                "            }\n" +
                "        }\n" +
                "        bZ.t = b5;\n" +
                "        bZ.clamp();\n" +
                "        if (b8 > 0) {\n" +
                "            bZ.rShiftTo(b8, bZ)\n" +
                "        }\n" +
                "        if (z < 0) {\n" +
                "            bf.ZERO.subTo(bZ, bZ)\n" +
                "        }\n" +
                "    }\n" +
                "    function bh(t) {\n" +
                "        var z = bm();\n" +
                "        this.abs().divRemTo(t, null, z);\n" +
                "        if (this.s < 0 && z.compareTo(bf.ZERO) > 0) {\n" +
                "            t.subTo(z, z)\n" +
                "        }\n" +
                "        return z\n" +
                "    }\n" +
                "    function aT(t) {\n" +
                "        this.m = t\n" +
                "    }\n" +
                "    function aI(t) {\n" +
                "        if (t.s < 0 || t.compareTo(this.m) >= 0) {\n" +
                "            return t.mod(this.m)\n" +
                "        } else {\n" +
                "            return t\n" +
                "        }\n" +
                "    }\n" +
                "    function c(t) {\n" +
                "        return t\n" +
                "    }\n" +
                "    function V(t) {\n" +
                "        t.divRemTo(this.m, null, t)\n" +
                "    }\n" +
                "    function p(t, L, z) {\n" +
                "        t.multiplyTo(L, z);\n" +
                "        this.reduce(z)\n" +
                "    }\n" +
                "    function aF(t, z) {\n" +
                "        t.squareTo(z);\n" +
                "        this.reduce(z)\n" +
                "    }\n" +
                "    aT.prototype.convert = aI;\n" +
                "    aT.prototype.revert = c;\n" +
                "    aT.prototype.reduce = V;\n" +
                "    aT.prototype.mulTo = p;\n" +
                "    aT.prototype.sqrTo = aF;\n" +
                "    function ab() {\n" +
                "        if (this.t < 1) {\n" +
                "            return 0\n" +
                "        }\n" +
                "        var t = this[0];\n" +
                "        if ((t & 1) == 0) {\n" +
                "            return 0\n" +
                "        }\n" +
                "        var z = t & 3;\n" +
                "        z = (z * (2 - (t & 15) * z)) & 15;\n" +
                "        z = (z * (2 - (t & 255) * z)) & 255;\n" +
                "        z = (z * (2 - (((t & 65535) * z) & 65535))) & 65535;\n" +
                "        z = (z * (2 - t * z % this.DV)) % this.DV;\n" +
                "        return (z > 0) ? this.DV - z: -z\n" +
                "    }\n" +
                "    function K(t) {\n" +
                "        this.m = t;\n" +
                "        this.mp = t.invDigit();\n" +
                "        this.mpl = this.mp & 32767;\n" +
                "        this.mph = this.mp >> 15;\n" +
                "        this.um = (1 << (t.DB - 15)) - 1;\n" +
                "        this.mt2 = 2 * t.t\n" +
                "    }\n" +
                "    function by(t) {\n" +
                "        var z = bm();\n" +
                "        t.abs().dlShiftTo(this.m.t, z);\n" +
                "        z.divRemTo(this.m, null, z);\n" +
                "        if (t.s < 0 && z.compareTo(bf.ZERO) > 0) {\n" +
                "            this.m.subTo(z, z)\n" +
                "        }\n" +
                "        return z\n" +
                "    }\n" +
                "    function bl(t) {\n" +
                "        var z = bm();\n" +
                "        t.copyTo(z);\n" +
                "        this.reduce(z);\n" +
                "        return z\n" +
                "    }\n" +
                "    function bV(t) {\n" +
                "        while (t.t <= this.mt2) {\n" +
                "            t[t.t++] = 0\n" +
                "        }\n" +
                "        for (var L = 0; L < this.m.t; ++L) {\n" +
                "            var z = t[L] & 32767;\n" +
                "            var bW = (z * this.mpl + (((z * this.mph + (t[L] >> 15) * this.mpl) & this.um) << 15)) & t.DM;\n" +
                "            z = L + this.m.t;\n" +
                "            t[z] += this.m.am(0, bW, t, L, 0, this.m.t);\n" +
                "            while (t[z] >= t.DV) {\n" +
                "                t[z] -= t.DV;\n" +
                "                t[++z]++\n" +
                "            }\n" +
                "        }\n" +
                "        t.clamp();\n" +
                "        t.drShiftTo(this.m.t, t);\n" +
                "        if (t.compareTo(this.m) >= 0) {\n" +
                "            t.subTo(this.m, t)\n" +
                "        }\n" +
                "    }\n" +
                "    function ac(t, z) {\n" +
                "        t.squareTo(z);\n" +
                "        this.reduce(z)\n" +
                "    }\n" +
                "    function bz(t, L, z) {\n" +
                "        t.multiplyTo(L, z);\n" +
                "        this.reduce(z)\n" +
                "    }\n" +
                "    K.prototype.convert = by;\n" +
                "    K.prototype.revert = bl;\n" +
                "    K.prototype.reduce = bV;\n" +
                "    K.prototype.mulTo = bz;\n" +
                "    K.prototype.sqrTo = ac;\n" +
                "    function ad() {\n" +
                "        return ((this.t > 0) ? (this[0] & 1) : this.s) == 0\n" +
                "    }\n" +
                "    function am(b0, b1) {\n" +
                "        if (b0 > 4294967295 || b0 < 1) {\n" +
                "            return bf.ONE\n" +
                "        }\n" +
                "        var bZ = bm(),\n" +
                "        L = bm(),\n" +
                "        bY = b1.convert(this),\n" +
                "        bX = q(b0) - 1;\n" +
                "        bY.copyTo(bZ);\n" +
                "        while (--bX >= 0) {\n" +
                "            b1.sqrTo(bZ, L);\n" +
                "            if ((b0 & (1 << bX)) > 0) {\n" +
                "                b1.mulTo(L, bY, bZ)\n" +
                "            } else {\n" +
                "                var bW = bZ;\n" +
                "                bZ = L;\n" +
                "                L = bW\n" +
                "            }\n" +
                "        }\n" +
                "        return b1.revert(bZ)\n" +
                "    }\n" +
                "    function aG(L, t) {\n" +
                "        var bW;\n" +
                "        if (L < 256 || t.isEven()) {\n" +
                "            bW = new aT(t)\n" +
                "        } else {\n" +
                "            bW = new K(t)\n" +
                "        }\n" +
                "        return this.exp(L, bW)\n" +
                "    }\n" +
                "    bf.prototype.copyTo = d;\n" +
                "    bf.prototype.fromInt = h;\n" +
                "    bf.prototype.fromString = bI;\n" +
                "    bf.prototype.clamp = bA;\n" +
                "    bf.prototype.dlShiftTo = bv;\n" +
                "    bf.prototype.drShiftTo = a2;\n" +
                "    bf.prototype.lShiftTo = s;\n" +
                "    bf.prototype.rShiftTo = bT;\n" +
                "    bf.prototype.subTo = bs;\n" +
                "    bf.prototype.multiplyTo = bJ;\n" +
                "    bf.prototype.squareTo = au;\n" +
                "    bf.prototype.divRemTo = a9;\n" +
                "    bf.prototype.invDigit = ab;\n" +
                "    bf.prototype.isEven = ad;\n" +
                "    bf.prototype.exp = am;\n" +
                "    bf.prototype.toString = u;\n" +
                "    bf.prototype.negate = bC;\n" +
                "    bf.prototype.abs = bB;\n" +
                "    bf.prototype.compareTo = bN;\n" +
                "    bf.prototype.bitLength = bt;\n" +
                "    bf.prototype.mod = bh;\n" +
                "    bf.prototype.modPowInt = aG;\n" +
                "    bf.ZERO = bi(0);\n" +
                "    bf.ONE = bi(1);\n" +
                "    function f() {\n" +
                "        var t = bm();\n" +
                "        this.copyTo(t);\n" +
                "        return t\n" +
                "    }\n" +
                "    function b() {\n" +
                "        if (this.s < 0) {\n" +
                "            if (this.t == 1) {\n" +
                "                return this[0] - this.DV\n" +
                "            } else {\n" +
                "                if (this.t == 0) {\n" +
                "                    return - 1\n" +
                "                }\n" +
                "            }\n" +
                "        } else {\n" +
                "            if (this.t == 1) {\n" +
                "                return this[0]\n" +
                "            } else {\n" +
                "                if (this.t == 0) {\n" +
                "                    return 0\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        return ((this[1] & ((1 << (32 - this.DB)) - 1)) << this.DB) | this[0]\n" +
                "    }\n" +
                "    function bF() {\n" +
                "        return (this.t == 0) ? this.s: (this[0] << 24) >> 24\n" +
                "    }\n" +
                "    function ag() {\n" +
                "        return (this.t == 0) ? this.s: (this[0] << 16) >> 16\n" +
                "    }\n" +
                "    function aU(t) {\n" +
                "        return Math.floor(Math.LN2 * this.DB / Math.log(t))\n" +
                "    }\n" +
                "    function aZ() {\n" +
                "        if (this.s < 0) {\n" +
                "            return - 1\n" +
                "        } else {\n" +
                "            if (this.t <= 0 || (this.t == 1 && this[0] <= 0)) {\n" +
                "                return 0\n" +
                "            } else {\n" +
                "                return 1\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    function I(t) {\n" +
                "        if (t == null) {\n" +
                "            t = 10\n" +
                "        }\n" +
                "        if (this.signum() == 0 || t < 2 || t > 36) {\n" +
                "            return \"0\"\n" +
                "        }\n" +
                "        var bW = this.chunkSize(t);\n" +
                "        var L = Math.pow(t, bW);\n" +
                "        var bZ = bi(L),\n" +
                "        b0 = bm(),\n" +
                "        bY = bm(),\n" +
                "        bX = \"\";\n" +
                "        this.divRemTo(bZ, b0, bY);\n" +
                "        while (b0.signum() > 0) {\n" +
                "            bX = (L + bY.intValue()).toString(t).substr(1) + bX;\n" +
                "            b0.divRemTo(bZ, b0, bY)\n" +
                "        }\n" +
                "        return bY.intValue().toString(t) + bX\n" +
                "    }\n" +
                "    function av(b1, bY) {\n" +
                "        this.fromInt(0);\n" +
                "        if (bY == null) {\n" +
                "            bY = 10\n" +
                "        }\n" +
                "        var bW = this.chunkSize(bY);\n" +
                "        var bX = Math.pow(bY, bW),\n" +
                "        L = false,\n" +
                "        t = 0,\n" +
                "        b0 = 0;\n" +
                "        for (var z = 0; z < b1.length; ++z) {\n" +
                "            var bZ = aX(b1, z);\n" +
                "            if (bZ < 0) {\n" +
                "                if (b1.charAt(z) == \"-\" && this.signum() == 0) {\n" +
                "                    L = true\n" +
                "                }\n" +
                "                continue\n" +
                "            }\n" +
                "            b0 = bY * b0 + bZ;\n" +
                "            if (++t >= bW) {\n" +
                "                this.dMultiply(bX);\n" +
                "                this.dAddOffset(b0, 0);\n" +
                "                t = 0;\n" +
                "                b0 = 0\n" +
                "            }\n" +
                "        }\n" +
                "        if (t > 0) {\n" +
                "            this.dMultiply(Math.pow(bY, t));\n" +
                "            this.dAddOffset(b0, 0)\n" +
                "        }\n" +
                "        if (L) {\n" +
                "            bf.ZERO.subTo(this, this)\n" +
                "        }\n" +
                "    }\n" +
                "    function aP(bW, L, bY) {\n" +
                "        if (\"number\" == typeof L) {\n" +
                "            if (bW < 2) {\n" +
                "                this.fromInt(1)\n" +
                "            } else {\n" +
                "                this.fromNumber(bW, bY);\n" +
                "                if (!this.testBit(bW - 1)) {\n" +
                "                    this.bitwiseTo(bf.ONE.shiftLeft(bW - 1), ak, this)\n" +
                "                }\n" +
                "                if (this.isEven()) {\n" +
                "                    this.dAddOffset(1, 0)\n" +
                "                }\n" +
                "                while (!this.isProbablePrime(L)) {\n" +
                "                    this.dAddOffset(2, 0);\n" +
                "                    if (this.bitLength() > bW) {\n" +
                "                        this.subTo(bf.ONE.shiftLeft(bW - 1), this)\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        } else {\n" +
                "            var z = new Array(),\n" +
                "            bX = bW & 7;\n" +
                "            z.length = (bW >> 3) + 1;\n" +
                "            L.nextBytes(z);\n" +
                "            if (bX > 0) {\n" +
                "                z[0] &= ((1 << bX) - 1)\n" +
                "            } else {\n" +
                "                z[0] = 0\n" +
                "            }\n" +
                "            this.fromString(z, 256)\n" +
                "        }\n" +
                "    }\n" +
                "    function aK() {\n" +
                "        var z = this.t,\n" +
                "        L = new Array();\n" +
                "        L[0] = this.s;\n" +
                "        var bW = this.DB - (z * this.DB) % 8,\n" +
                "        bX,\n" +
                "        t = 0;\n" +
                "        if (z-->0) {\n" +
                "            if (bW < this.DB && (bX = this[z] >> bW) != (this.s & this.DM) >> bW) {\n" +
                "                L[t++] = bX | (this.s << (this.DB - bW))\n" +
                "            }\n" +
                "            while (z >= 0) {\n" +
                "                if (bW < 8) {\n" +
                "                    bX = (this[z] & ((1 << bW) - 1)) << (8 - bW);\n" +
                "                    bX |= this[--z] >> (bW += this.DB - 8)\n" +
                "                } else {\n" +
                "                    bX = (this[z] >> (bW -= 8)) & 255;\n" +
                "                    if (bW <= 0) {\n" +
                "                        bW += this.DB; --z\n" +
                "                    }\n" +
                "                }\n" +
                "                if ((bX & 128) != 0) {\n" +
                "                    bX |= -256\n" +
                "                }\n" +
                "                if (t == 0 && (this.s & 128) != (bX & 128)) {++t\n" +
                "                }\n" +
                "                if (t > 0 || bX != this.s) {\n" +
                "                    L[t++] = bX\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        return L\n" +
                "    }\n" +
                "    function bG(t) {\n" +
                "        return (this.compareTo(t) == 0)\n" +
                "    }\n" +
                "    function W(t) {\n" +
                "        return (this.compareTo(t) < 0) ? this: t\n" +
                "    }\n" +
                "    function bu(t) {\n" +
                "        return (this.compareTo(t) > 0) ? this: t\n" +
                "    }\n" +
                "    function aJ(z, bY, bW) {\n" +
                "        var L, bX, t = Math.min(z.t, this.t);\n" +
                "        for (L = 0; L < t; ++L) {\n" +
                "            bW[L] = bY(this[L], z[L])\n" +
                "        }\n" +
                "        if (z.t < this.t) {\n" +
                "            bX = z.s & this.DM;\n" +
                "            for (L = t; L < this.t; ++L) {\n" +
                "                bW[L] = bY(this[L], bX)\n" +
                "            }\n" +
                "            bW.t = this.t\n" +
                "        } else {\n" +
                "            bX = this.s & this.DM;\n" +
                "            for (L = t; L < z.t; ++L) {\n" +
                "                bW[L] = bY(bX, z[L])\n" +
                "            }\n" +
                "            bW.t = z.t\n" +
                "        }\n" +
                "        bW.s = bY(this.s, z.s);\n" +
                "        bW.clamp()\n" +
                "    }\n" +
                "    function o(t, z) {\n" +
                "        return t & z\n" +
                "    }\n" +
                "    function bO(t) {\n" +
                "        var z = bm();\n" +
                "        this.bitwiseTo(t, o, z);\n" +
                "        return z\n" +
                "    }\n" +
                "    function ak(t, z) {\n" +
                "        return t | z\n" +
                "    }\n" +
                "    function aS(t) {\n" +
                "        var z = bm();\n" +
                "        this.bitwiseTo(t, ak, z);\n" +
                "        return z\n" +
                "    }\n" +
                "    function aa(t, z) {\n" +
                "        return t ^ z\n" +
                "    }\n" +
                "    function B(t) {\n" +
                "        var z = bm();\n" +
                "        this.bitwiseTo(t, aa, z);\n" +
                "        return z\n" +
                "    }\n" +
                "    function i(t, z) {\n" +
                "        return t & ~z\n" +
                "    }\n" +
                "    function aD(t) {\n" +
                "        var z = bm();\n" +
                "        this.bitwiseTo(t, i, z);\n" +
                "        return z\n" +
                "    }\n" +
                "    function T() {\n" +
                "        var z = bm();\n" +
                "        for (var t = 0; t < this.t; ++t) {\n" +
                "            z[t] = this.DM & ~this[t]\n" +
                "        }\n" +
                "        z.t = this.t;\n" +
                "        z.s = ~this.s;\n" +
                "        return z\n" +
                "    }\n" +
                "    function aN(z) {\n" +
                "        var t = bm();\n" +
                "        if (z < 0) {\n" +
                "            this.rShiftTo( - z, t)\n" +
                "        } else {\n" +
                "            this.lShiftTo(z, t)\n" +
                "        }\n" +
                "        return t\n" +
                "    }\n" +
                "    function R(z) {\n" +
                "        var t = bm();\n" +
                "        if (z < 0) {\n" +
                "            this.lShiftTo( - z, t)\n" +
                "        } else {\n" +
                "            this.rShiftTo(z, t)\n" +
                "        }\n" +
                "        return t\n" +
                "    }\n" +
                "    function bc(t) {\n" +
                "        if (t == 0) {\n" +
                "            return - 1\n" +
                "        }\n" +
                "        var z = 0;\n" +
                "        if ((t & 65535) == 0) {\n" +
                "            t >>= 16;\n" +
                "            z += 16\n" +
                "        }\n" +
                "        if ((t & 255) == 0) {\n" +
                "            t >>= 8;\n" +
                "            z += 8\n" +
                "        }\n" +
                "        if ((t & 15) == 0) {\n" +
                "            t >>= 4;\n" +
                "            z += 4\n" +
                "        }\n" +
                "        if ((t & 3) == 0) {\n" +
                "            t >>= 2;\n" +
                "            z += 2\n" +
                "        }\n" +
                "        if ((t & 1) == 0) {++z\n" +
                "        }\n" +
                "        return z\n" +
                "    }\n" +
                "    function aq() {\n" +
                "        for (var t = 0; t < this.t; ++t) {\n" +
                "            if (this[t] != 0) {\n" +
                "                return t * this.DB + bc(this[t])\n" +
                "            }\n" +
                "        }\n" +
                "        if (this.s < 0) {\n" +
                "            return this.t * this.DB\n" +
                "        }\n" +
                "        return - 1\n" +
                "    }\n" +
                "    function bj(t) {\n" +
                "        var z = 0;\n" +
                "        while (t != 0) {\n" +
                "            t &= t - 1; ++z\n" +
                "        }\n" +
                "        return z\n" +
                "    }\n" +
                "    function ao() {\n" +
                "        var L = 0,\n" +
                "        t = this.s & this.DM;\n" +
                "        for (var z = 0; z < this.t; ++z) {\n" +
                "            L += bj(this[z] ^ t)\n" +
                "        }\n" +
                "        return L\n" +
                "    }\n" +
                "    function aL(z) {\n" +
                "        var t = Math.floor(z / this.DB);\n" +
                "        if (t >= this.t) {\n" +
                "            return (this.s != 0)\n" +
                "        }\n" +
                "        return ((this[t] & (1 << (z % this.DB))) != 0)\n" +
                "    }\n" +
                "    function U(L, z) {\n" +
                "        var t = bf.ONE.shiftLeft(L);\n" +
                "        this.bitwiseTo(t, z, t);\n" +
                "        return t\n" +
                "    }\n" +
                "    function a1(t) {\n" +
                "        return this.changeBit(t, ak)\n" +
                "    }\n" +
                "    function ah(t) {\n" +
                "        return this.changeBit(t, i)\n" +
                "    }\n" +
                "    function aO(t) {\n" +
                "        return this.changeBit(t, aa)\n" +
                "    }\n" +
                "    function S(z, bW) {\n" +
                "        var L = 0,\n" +
                "        bX = 0,\n" +
                "        t = Math.min(z.t, this.t);\n" +
                "        while (L < t) {\n" +
                "            bX += this[L] + z[L];\n" +
                "            bW[L++] = bX & this.DM;\n" +
                "            bX >>= this.DB\n" +
                "        }\n" +
                "        if (z.t < this.t) {\n" +
                "            bX += z.s;\n" +
                "            while (L < this.t) {\n" +
                "                bX += this[L];\n" +
                "                bW[L++] = bX & this.DM;\n" +
                "                bX >>= this.DB\n" +
                "            }\n" +
                "            bX += this.s\n" +
                "        } else {\n" +
                "            bX += this.s;\n" +
                "            while (L < z.t) {\n" +
                "                bX += z[L];\n" +
                "                bW[L++] = bX & this.DM;\n" +
                "                bX >>= this.DB\n" +
                "            }\n" +
                "            bX += z.s\n" +
                "        }\n" +
                "        bW.s = (bX < 0) ? -1 : 0;\n" +
                "        if (bX > 0) {\n" +
                "            bW[L++] = bX\n" +
                "        } else {\n" +
                "            if (bX < -1) {\n" +
                "                bW[L++] = this.DV + bX\n" +
                "            }\n" +
                "        }\n" +
                "        bW.t = L;\n" +
                "        bW.clamp()\n" +
                "    }\n" +
                "    function bg(t) {\n" +
                "        var z = bm();\n" +
                "        this.addTo(t, z);\n" +
                "        return z\n" +
                "    }\n" +
                "    function aA(t) {\n" +
                "        var z = bm();\n" +
                "        this.subTo(t, z);\n" +
                "        return z\n" +
                "    }\n" +
                "    function bH(t) {\n" +
                "        var z = bm();\n" +
                "        this.multiplyTo(t, z);\n" +
                "        return z\n" +
                "    }\n" +
                "    function bU() {\n" +
                "        var t = bm();\n" +
                "        this.squareTo(t);\n" +
                "        return t\n" +
                "    }\n" +
                "    function bd(t) {\n" +
                "        var z = bm();\n" +
                "        this.divRemTo(t, z, null);\n" +
                "        return z\n" +
                "    }\n" +
                "    function bP(t) {\n" +
                "        var z = bm();\n" +
                "        this.divRemTo(t, null, z);\n" +
                "        return z\n" +
                "    }\n" +
                "    function bk(t) {\n" +
                "        var L = bm(),\n" +
                "        z = bm();\n" +
                "        this.divRemTo(t, L, z);\n" +
                "        return new Array(L, z)\n" +
                "    }\n" +
                "    function e(t) {\n" +
                "        this[this.t] = this.am(0, t - 1, this, 0, 0, this.t); ++this.t;\n" +
                "        this.clamp()\n" +
                "    }\n" +
                "    function aR(z, t) {\n" +
                "        if (z == 0) {\n" +
                "            return\n" +
                "        }\n" +
                "        while (this.t <= t) {\n" +
                "            this[this.t++] = 0\n" +
                "        }\n" +
                "        this[t] += z;\n" +
                "        while (this[t] >= this.DV) {\n" +
                "            this[t] -= this.DV;\n" +
                "            if (++t >= this.t) {\n" +
                "                this[this.t++] = 0\n" +
                "            }++this[t]\n" +
                "        }\n" +
                "    }\n" +
                "    function Z() {}\n" +
                "    function bw(t) {\n" +
                "        return t\n" +
                "    }\n" +
                "    function bK(t, L, z) {\n" +
                "        t.multiplyTo(L, z)\n" +
                "    }\n" +
                "    function ai(t, z) {\n" +
                "        t.squareTo(z)\n" +
                "    }\n" +
                "    Z.prototype.convert = bw;\n" +
                "    Z.prototype.revert = bw;\n" +
                "    Z.prototype.mulTo = bK;\n" +
                "    Z.prototype.sqrTo = ai;\n" +
                "    function Q(t) {\n" +
                "        return this.exp(t, new Z())\n" +
                "    }\n" +
                "    function aQ(t, bX, bW) {\n" +
                "        var L = Math.min(this.t + t.t, bX);\n" +
                "        bW.s = 0;\n" +
                "        bW.t = L;\n" +
                "        while (L > 0) {\n" +
                "            bW[--L] = 0\n" +
                "        }\n" +
                "        var z;\n" +
                "        for (z = bW.t - this.t; L < z; ++L) {\n" +
                "            bW[L + this.t] = this.am(0, t[L], bW, L, 0, this.t)\n" +
                "        }\n" +
                "        for (z = Math.min(t.t, bX); L < z; ++L) {\n" +
                "            this.am(0, t[L], bW, L, 0, bX - L)\n" +
                "        }\n" +
                "        bW.clamp()\n" +
                "    }\n" +
                "    function a0(t, bW, L) {--bW;\n" +
                "        var z = L.t = this.t + t.t - bW;\n" +
                "        L.s = 0;\n" +
                "        while (--z >= 0) {\n" +
                "            L[z] = 0\n" +
                "        }\n" +
                "        for (z = Math.max(bW - this.t, 0); z < t.t; ++z) {\n" +
                "            L[this.t + z - bW] = this.am(bW - z, t[z], L, 0, 0, this.t + z - bW)\n" +
                "        }\n" +
                "        L.clamp();\n" +
                "        L.drShiftTo(1, L)\n" +
                "    }\n" +
                "    function bR(t) {\n" +
                "        this.r2 = bm();\n" +
                "        this.q3 = bm();\n" +
                "        bf.ONE.dlShiftTo(2 * t.t, this.r2);\n" +
                "        this.mu = this.r2.divide(t);\n" +
                "        this.m = t\n" +
                "    }\n" +
                "    function H(t) {\n" +
                "        if (t.s < 0 || t.t > 2 * this.m.t) {\n" +
                "            return t.mod(this.m)\n" +
                "        } else {\n" +
                "            if (t.compareTo(this.m) < 0) {\n" +
                "                return t\n" +
                "            } else {\n" +
                "                var z = bm();\n" +
                "                t.copyTo(z);\n" +
                "                this.reduce(z);\n" +
                "                return z\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    function bM(t) {\n" +
                "        return t\n" +
                "    }\n" +
                "    function D(t) {\n" +
                "        t.drShiftTo(this.m.t - 1, this.r2);\n" +
                "        if (t.t > this.m.t + 1) {\n" +
                "            t.t = this.m.t + 1;\n" +
                "            t.clamp()\n" +
                "        }\n" +
                "        this.mu.multiplyUpperTo(this.r2, this.m.t + 1, this.q3);\n" +
                "        this.m.multiplyLowerTo(this.q3, this.m.t + 1, this.r2);\n" +
                "        while (t.compareTo(this.r2) < 0) {\n" +
                "            t.dAddOffset(1, this.m.t + 1)\n" +
                "        }\n" +
                "        t.subTo(this.r2, t);\n" +
                "        while (t.compareTo(this.m) >= 0) {\n" +
                "            t.subTo(this.m, t)\n" +
                "        }\n" +
                "    }\n" +
                "    function aM(t, z) {\n" +
                "        t.squareTo(z);\n" +
                "        this.reduce(z)\n" +
                "    }\n" +
                "    function x(t, L, z) {\n" +
                "        t.multiplyTo(L, z);\n" +
                "        this.reduce(z)\n" +
                "    }\n" +
                "    bR.prototype.convert = H;\n" +
                "    bR.prototype.revert = bM;\n" +
                "    bR.prototype.reduce = D;\n" +
                "    bR.prototype.mulTo = x;\n" +
                "    bR.prototype.sqrTo = aM;\n" +
                "    function N(b4, bZ) {\n" +
                "        var b2 = b4.bitLength(),\n" +
                "        b0,\n" +
                "        bW = bi(1),\n" +
                "        b7;\n" +
                "        if (b2 <= 0) {\n" +
                "            return bW\n" +
                "        } else {\n" +
                "            if (b2 < 18) {\n" +
                "                b0 = 1\n" +
                "            } else {\n" +
                "                if (b2 < 48) {\n" +
                "                    b0 = 3\n" +
                "                } else {\n" +
                "                    if (b2 < 144) {\n" +
                "                        b0 = 4\n" +
                "                    } else {\n" +
                "                        if (b2 < 768) {\n" +
                "                            b0 = 5\n" +
                "                        } else {\n" +
                "                            b0 = 6\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        if (b2 < 8) {\n" +
                "            b7 = new aT(bZ)\n" +
                "        } else {\n" +
                "            if (bZ.isEven()) {\n" +
                "                b7 = new bR(bZ)\n" +
                "            } else {\n" +
                "                b7 = new K(bZ)\n" +
                "            }\n" +
                "        }\n" +
                "        var b3 = new Array(),\n" +
                "        bY = 3,\n" +
                "        b5 = b0 - 1,\n" +
                "        L = (1 << b0) - 1;\n" +
                "        b3[1] = b7.convert(this);\n" +
                "        if (b0 > 1) {\n" +
                "            var ca = bm();\n" +
                "            b7.sqrTo(b3[1], ca);\n" +
                "            while (bY <= L) {\n" +
                "                b3[bY] = bm();\n" +
                "                b7.mulTo(ca, b3[bY - 2], b3[bY]);\n" +
                "                bY += 2\n" +
                "            }\n" +
                "        }\n" +
                "        var b1 = b4.t - 1,\n" +
                "        b8, b6 = true,\n" +
                "        bX = bm(),\n" +
                "        b9;\n" +
                "        b2 = q(b4[b1]) - 1;\n" +
                "        while (b1 >= 0) {\n" +
                "            if (b2 >= b5) {\n" +
                "                b8 = (b4[b1] >> (b2 - b5)) & L\n" +
                "            } else {\n" +
                "                b8 = (b4[b1] & ((1 << (b2 + 1)) - 1)) << (b5 - b2);\n" +
                "                if (b1 > 0) {\n" +
                "                    b8 |= b4[b1 - 1] >> (this.DB + b2 - b5)\n" +
                "                }\n" +
                "            }\n" +
                "            bY = b0;\n" +
                "            while ((b8 & 1) == 0) {\n" +
                "                b8 >>= 1; --bY\n" +
                "            }\n" +
                "            if ((b2 -= bY) < 0) {\n" +
                "                b2 += this.DB; --b1\n" +
                "            }\n" +
                "            if (b6) {\n" +
                "                b3[b8].copyTo(bW);\n" +
                "                b6 = false\n" +
                "            } else {\n" +
                "                while (bY > 1) {\n" +
                "                    b7.sqrTo(bW, bX);\n" +
                "                    b7.sqrTo(bX, bW);\n" +
                "                    bY -= 2\n" +
                "                }\n" +
                "                if (bY > 0) {\n" +
                "                    b7.sqrTo(bW, bX)\n" +
                "                } else {\n" +
                "                    b9 = bW;\n" +
                "                    bW = bX;\n" +
                "                    bX = b9\n" +
                "                }\n" +
                "                b7.mulTo(bX, b3[b8], bW)\n" +
                "            }\n" +
                "            while (b1 >= 0 && (b4[b1] & (1 << b2)) == 0) {\n" +
                "                b7.sqrTo(bW, bX);\n" +
                "                b9 = bW;\n" +
                "                bW = bX;\n" +
                "                bX = b9;\n" +
                "                if (--b2 < 0) {\n" +
                "                    b2 = this.DB - 1; --b1\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        return b7.revert(bW)\n" +
                "    }\n" +
                "    function aB(L) {\n" +
                "        var z = (this.s < 0) ? this.negate() : this.clone();\n" +
                "        var bZ = (L.s < 0) ? L.negate() : L.clone();\n" +
                "        if (z.compareTo(bZ) < 0) {\n" +
                "            var bX = z;\n" +
                "            z = bZ;\n" +
                "            bZ = bX\n" +
                "        }\n" +
                "        var bW = z.getLowestSetBit(),\n" +
                "        bY = bZ.getLowestSetBit();\n" +
                "        if (bY < 0) {\n" +
                "            return z\n" +
                "        }\n" +
                "        if (bW < bY) {\n" +
                "            bY = bW\n" +
                "        }\n" +
                "        if (bY > 0) {\n" +
                "            z.rShiftTo(bY, z);\n" +
                "            bZ.rShiftTo(bY, bZ)\n" +
                "        }\n" +
                "        while (z.signum() > 0) {\n" +
                "            if ((bW = z.getLowestSetBit()) > 0) {\n" +
                "                z.rShiftTo(bW, z)\n" +
                "            }\n" +
                "            if ((bW = bZ.getLowestSetBit()) > 0) {\n" +
                "                bZ.rShiftTo(bW, bZ)\n" +
                "            }\n" +
                "            if (z.compareTo(bZ) >= 0) {\n" +
                "                z.subTo(bZ, z);\n" +
                "                z.rShiftTo(1, z)\n" +
                "            } else {\n" +
                "                bZ.subTo(z, bZ);\n" +
                "                bZ.rShiftTo(1, bZ)\n" +
                "            }\n" +
                "        }\n" +
                "        if (bY > 0) {\n" +
                "            bZ.lShiftTo(bY, bZ)\n" +
                "        }\n" +
                "        return bZ\n" +
                "    }\n" +
                "    function aj(bW) {\n" +
                "        if (bW <= 0) {\n" +
                "            return 0\n" +
                "        }\n" +
                "        var L = this.DV % bW,\n" +
                "        z = (this.s < 0) ? bW - 1 : 0;\n" +
                "        if (this.t > 0) {\n" +
                "            if (L == 0) {\n" +
                "                z = this[0] % bW\n" +
                "            } else {\n" +
                "                for (var t = this.t - 1; t >= 0; --t) {\n" +
                "                    z = (L * z + this[t]) % bW\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        return z\n" +
                "    }\n" +
                "    function bS(z) {\n" +
                "        var bY = z.isEven();\n" +
                "        if ((this.isEven() && bY) || z.signum() == 0) {\n" +
                "            return bf.ZERO\n" +
                "        }\n" +
                "        var bX = z.clone(),\n" +
                "        bW = this.clone();\n" +
                "        var L = bi(1),\n" +
                "        t = bi(0),\n" +
                "        b0 = bi(0),\n" +
                "        bZ = bi(1);\n" +
                "        while (bX.signum() != 0) {\n" +
                "            while (bX.isEven()) {\n" +
                "                bX.rShiftTo(1, bX);\n" +
                "                if (bY) {\n" +
                "                    if (!L.isEven() || !t.isEven()) {\n" +
                "                        L.addTo(this, L);\n" +
                "                        t.subTo(z, t)\n" +
                "                    }\n" +
                "                    L.rShiftTo(1, L)\n" +
                "                } else {\n" +
                "                    if (!t.isEven()) {\n" +
                "                        t.subTo(z, t)\n" +
                "                    }\n" +
                "                }\n" +
                "                t.rShiftTo(1, t)\n" +
                "            }\n" +
                "            while (bW.isEven()) {\n" +
                "                bW.rShiftTo(1, bW);\n" +
                "                if (bY) {\n" +
                "                    if (!b0.isEven() || !bZ.isEven()) {\n" +
                "                        b0.addTo(this, b0);\n" +
                "                        bZ.subTo(z, bZ)\n" +
                "                    }\n" +
                "                    b0.rShiftTo(1, b0)\n" +
                "                } else {\n" +
                "                    if (!bZ.isEven()) {\n" +
                "                        bZ.subTo(z, bZ)\n" +
                "                    }\n" +
                "                }\n" +
                "                bZ.rShiftTo(1, bZ)\n" +
                "            }\n" +
                "            if (bX.compareTo(bW) >= 0) {\n" +
                "                bX.subTo(bW, bX);\n" +
                "                if (bY) {\n" +
                "                    L.subTo(b0, L)\n" +
                "                }\n" +
                "                t.subTo(bZ, t)\n" +
                "            } else {\n" +
                "                bW.subTo(bX, bW);\n" +
                "                if (bY) {\n" +
                "                    b0.subTo(L, b0)\n" +
                "                }\n" +
                "                bZ.subTo(t, bZ)\n" +
                "            }\n" +
                "        }\n" +
                "        if (bW.compareTo(bf.ONE) != 0) {\n" +
                "            return bf.ZERO\n" +
                "        }\n" +
                "        if (bZ.compareTo(z) >= 0) {\n" +
                "            return bZ.subtract(z)\n" +
                "        }\n" +
                "        if (bZ.signum() < 0) {\n" +
                "            bZ.addTo(z, bZ)\n" +
                "        } else {\n" +
                "            return bZ\n" +
                "        }\n" +
                "        if (bZ.signum() < 0) {\n" +
                "            return bZ.add(z)\n" +
                "        } else {\n" +
                "            return bZ\n" +
                "        }\n" +
                "    }\n" +
                "    var az = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997];\n" +
                "    var k = (1 << 26) / az[az.length - 1];\n" +
                "    function bL(bY) {\n" +
                "        var bX, L = this.abs();\n" +
                "        if (L.t == 1 && L[0] <= az[az.length - 1]) {\n" +
                "            for (bX = 0; bX < az.length; ++bX) {\n" +
                "                if (L[0] == az[bX]) {\n" +
                "                    return true\n" +
                "                }\n" +
                "            }\n" +
                "            return false\n" +
                "        }\n" +
                "        if (L.isEven()) {\n" +
                "            return false\n" +
                "        }\n" +
                "        bX = 1;\n" +
                "        while (bX < az.length) {\n" +
                "            var z = az[bX],\n" +
                "            bW = bX + 1;\n" +
                "            while (bW < az.length && z < k) {\n" +
                "                z *= az[bW++]\n" +
                "            }\n" +
                "            z = L.modInt(z);\n" +
                "            while (bX < bW) {\n" +
                "                if (z % az[bX++] == 0) {\n" +
                "                    return false\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        return L.millerRabin(bY)\n" +
                "    }\n" +
                "    function aE(bY) {\n" +
                "        var bZ = this.subtract(bf.ONE);\n" +
                "        var L = bZ.getLowestSetBit();\n" +
                "        if (L <= 0) {\n" +
                "            return false\n" +
                "        }\n" +
                "        var b0 = bZ.shiftRight(L);\n" +
                "        bY = (bY + 1) >> 1;\n" +
                "        if (bY > az.length) {\n" +
                "            bY = az.length\n" +
                "        }\n" +
                "        var z = bm();\n" +
                "        for (var bX = 0; bX < bY; ++bX) {\n" +
                "            z.fromInt(az[Math.floor(Math.random() * az.length)]);\n" +
                "            var b1 = z.modPow(b0, this);\n" +
                "            if (b1.compareTo(bf.ONE) != 0 && b1.compareTo(bZ) != 0) {\n" +
                "                var bW = 1;\n" +
                "                while (bW++<L && b1.compareTo(bZ) != 0) {\n" +
                "                    b1 = b1.modPowInt(2, this);\n" +
                "                    if (b1.compareTo(bf.ONE) == 0) {\n" +
                "                        return false\n" +
                "                    }\n" +
                "                }\n" +
                "                if (b1.compareTo(bZ) != 0) {\n" +
                "                    return false\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        return true\n" +
                "    }\n" +
                "    bf.prototype.chunkSize = aU;\n" +
                "    bf.prototype.toRadix = I;\n" +
                "    bf.prototype.fromRadix = av;\n" +
                "    bf.prototype.fromNumber = aP;\n" +
                "    bf.prototype.bitwiseTo = aJ;\n" +
                "    bf.prototype.changeBit = U;\n" +
                "    bf.prototype.addTo = S;\n" +
                "    bf.prototype.dMultiply = e;\n" +
                "    bf.prototype.dAddOffset = aR;\n" +
                "    bf.prototype.multiplyLowerTo = aQ;\n" +
                "    bf.prototype.multiplyUpperTo = a0;\n" +
                "    bf.prototype.modInt = aj;\n" +
                "    bf.prototype.millerRabin = aE;\n" +
                "    bf.prototype.clone = f;\n" +
                "    bf.prototype.intValue = b;\n" +
                "    bf.prototype.byteValue = bF;\n" +
                "    bf.prototype.shortValue = ag;\n" +
                "    bf.prototype.signum = aZ;\n" +
                "    bf.prototype.toByteArray = aK;\n" +
                "    bf.prototype.equals = bG;\n" +
                "    bf.prototype.min = W;\n" +
                "    bf.prototype.max = bu;\n" +
                "    bf.prototype.and = bO;\n" +
                "    bf.prototype.or = aS;\n" +
                "    bf.prototype.xor = B;\n" +
                "    bf.prototype.andNot = aD;\n" +
                "    bf.prototype.not = T;\n" +
                "    bf.prototype.shiftLeft = aN;\n" +
                "    bf.prototype.shiftRight = R;\n" +
                "    bf.prototype.getLowestSetBit = aq;\n" +
                "    bf.prototype.bitCount = ao;\n" +
                "    bf.prototype.testBit = aL;\n" +
                "    bf.prototype.setBit = a1;\n" +
                "    bf.prototype.clearBit = ah;\n" +
                "    bf.prototype.flipBit = aO;\n" +
                "    bf.prototype.add = bg;\n" +
                "    bf.prototype.subtract = aA;\n" +
                "    bf.prototype.multiply = bH;\n" +
                "    bf.prototype.divide = bd;\n" +
                "    bf.prototype.remainder = bP;\n" +
                "    bf.prototype.divideAndRemainder = bk;\n" +
                "    bf.prototype.modPow = N;\n" +
                "    bf.prototype.modInverse = bS;\n" +
                "    bf.prototype.pow = Q;\n" +
                "    bf.prototype.gcd = aB;\n" +
                "    bf.prototype.isProbablePrime = bL;\n" +
                "    bf.prototype.square = bU;\n" +
                "    function bp() {\n" +
                "        this.i = 0;\n" +
                "        this.j = 0;\n" +
                "        this.S = new Array()\n" +
                "    }\n" +
                "    function af(bX) {\n" +
                "        var bW, z, L;\n" +
                "        for (bW = 0; bW < 256; ++bW) {\n" +
                "            this.S[bW] = bW\n" +
                "        }\n" +
                "        z = 0;\n" +
                "        for (bW = 0; bW < 256; ++bW) {\n" +
                "            z = (z + this.S[bW] + bX[bW % bX.length]) & 255;\n" +
                "            L = this.S[bW];\n" +
                "            this.S[bW] = this.S[z];\n" +
                "            this.S[z] = L\n" +
                "        }\n" +
                "        this.i = 0;\n" +
                "        this.j = 0\n" +
                "    }\n" +
                "    function be() {\n" +
                "        var z;\n" +
                "        this.i = (this.i + 1) & 255;\n" +
                "        this.j = (this.j + this.S[this.i]) & 255;\n" +
                "        z = this.S[this.i];\n" +
                "        this.S[this.i] = this.S[this.j];\n" +
                "        this.S[this.j] = z;\n" +
                "        return this.S[(z + this.S[this.i]) & 255]\n" +
                "    }\n" +
                "    bp.prototype.init = af;\n" +
                "    bp.prototype.next = be;\n" +
                "    function P() {\n" +
                "        return new bp()\n" +
                "    }\n" +
                "    var y = 256;\n" +
                "    var j;\n" +
                "    var l;\n" +
                "    var C;\n" +
                "    if (l == null) {\n" +
                "        l = new Array();\n" +
                "        C = 0;\n" +
                "        var ba;\n" +
                "//      if (window.crypto && window.crypto.getRandomValues) {\n" +
                "//          var a8 = new Uint32Array(256);\n" +
                "//          window.crypto.getRandomValues(a8);\n" +
                "//          for (ba = 0; ba < a8.length; ++ba) {\n" +
                "//              l[C++] = a8[ba] & 255\n" +
                "//          }\n" +
                "//      }\n" +
                "//      var F = function(z) {\n" +
                "//          this.count = this.count || 0;\n" +
                "//          if (this.count >= 256 || C >= y) {\n" +
                "//              if (window.removeEventListener) {\n" +
                "//                  window.removeEventListener(\"mousemove\", F, false)\n" +
                "//              } else {\n" +
                "//                  if (window.detachEvent) {\n" +
                "//                      window.detachEvent(\"onmousemove\", F)\n" +
                "//                  }\n" +
                "//              }\n" +
                "//              return\n" +
                "//          }\n" +
                "//          try {\n" +
                "//              var t = z.x + z.y;\n" +
                "//              l[C++] = t & 255;\n" +
                "//              this.count += 1\n" +
                "//          } catch(L) {}\n" +
                "//      };\n" +
                "//      if (window.addEventListener) {\n" +
                "//          window.addEventListener(\"mousemove\", F, false)\n" +
                "//      } else {\n" +
                "//          if (window.attachEvent) {\n" +
                "//              window.attachEvent(\"onmousemove\", F)\n" +
                "//          }\n" +
                "//      }\n" +
                "    }\n" +
                "    function bb() {\n" +
                "        if (j == null) {\n" +
                "            j = P();\n" +
                "            while (C < y) {\n" +
                "                var t = Math.floor(65536 * Math.random());\n" +
                "                l[C++] = t & 255\n" +
                "            }\n" +
                "            j.init(l);\n" +
                "            for (C = 0; C < l.length; ++C) {\n" +
                "                l[C] = 0\n" +
                "            }\n" +
                "            C = 0\n" +
                "        }\n" +
                "        return j.next()\n" +
                "    }\n" +
                "    function aY(z) {\n" +
                "        var t;\n" +
                "        for (t = 0; t < z.length; ++t) {\n" +
                "            z[t] = bb()\n" +
                "        }\n" +
                "    }\n" +
                "    function G() {}\n" +
                "    G.prototype.nextBytes = aY;\n" +
                "    function w(z, t) {\n" +
                "        return new bf(z, t)\n" +
                "    }\n" +
                "    function m(L, bW) {\n" +
                "        var t = \"\";\n" +
                "        var z = 0;\n" +
                "        while (z + bW < L.length) {\n" +
                "            t += L.substring(z, z + bW) + \"\\n\";\n" +
                "            z += bW\n" +
                "        }\n" +
                "        return t + L.substring(z, L.length)\n" +
                "    }\n" +
                "    function br(t) {\n" +
                "        if (t < 16) {\n" +
                "            return \"0\" + t.toString(16)\n" +
                "        } else {\n" +
                "            return t.toString(16)\n" +
                "        }\n" +
                "    }\n" +
                "    function bD(bW, bZ) {\n" +
                "        if (bZ < bW.length + 11) {\n" +
                "            console.error(\"Message too long for RSA\");\n" +
                "            return null\n" +
                "        }\n" +
                "        var bY = new Array();\n" +
                "        var L = bW.length - 1;\n" +
                "        while (L >= 0 && bZ > 0) {\n" +
                "            var bX = bW.charCodeAt(L--);\n" +
                "            if (bX < 128) {\n" +
                "                bY[--bZ] = bX\n" +
                "            } else {\n" +
                "                if ((bX > 127) && (bX < 2048)) {\n" +
                "                    bY[--bZ] = (bX & 63) | 128;\n" +
                "                    bY[--bZ] = (bX >> 6) | 192\n" +
                "                } else {\n" +
                "                    bY[--bZ] = (bX & 63) | 128;\n" +
                "                    bY[--bZ] = ((bX >> 6) & 63) | 128;\n" +
                "                    bY[--bZ] = (bX >> 12) | 224\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        bY[--bZ] = 0;\n" +
                "        var z = new G();\n" +
                "        var t = new Array();\n" +
                "        while (bZ > 2) {\n" +
                "            t[0] = 0;\n" +
                "            while (t[0] == 0) {\n" +
                "                z.nextBytes(t)\n" +
                "            }\n" +
                "            bY[--bZ] = t[0]\n" +
                "        }\n" +
                "        bY[--bZ] = 2;\n" +
                "        bY[--bZ] = 0;\n" +
                "        return new bf(bY)\n" +
                "    }\n" +
                "    function A() {\n" +
                "        this.n = null;\n" +
                "        this.e = 0;\n" +
                "        this.d = null;\n" +
                "        this.p = null;\n" +
                "        this.q = null;\n" +
                "        this.dmp1 = null;\n" +
                "        this.dmq1 = null;\n" +
                "        this.coeff = null\n" +
                "    }\n" +
                "    function an(z, t) {\n" +
                "        if (z != null && t != null && z.length > 0 && t.length > 0) {\n" +
                "            this.n = w(z, 16);\n" +
                "            this.e = parseInt(t, 16)\n" +
                "        } else {\n" +
                "            console.error(\"Invalid RSA public key\")\n" +
                "        }\n" +
                "    }\n" +
                "    function bq(t) {\n" +
                "        return t.modPowInt(this.e, this.n)\n" +
                "    }\n" +
                "    function al(L) {\n" +
                "        var t = bD(L, (this.n.bitLength() + 7) >> 3);\n" +
                "        if (t == null) {\n" +
                "            return null\n" +
                "        }\n" +
                "        var bW = this.doPublic(t);\n" +
                "        if (bW == null) {\n" +
                "            return null\n" +
                "        }\n" +
                "        var z = bW.toString(16);\n" +
                "        if ((z.length & 1) == 0) {\n" +
                "            return z\n" +
                "        } else {\n" +
                "            return \"0\" + z\n" +
                "        }\n" +
                "    }\n" +
                "    A.prototype.doPublic = bq;\n" +
                "    A.prototype.setPublic = an;\n" +
                "    A.prototype.encrypt = al;\n" +
                "    function bo(bW, bY) {\n" +
                "        var t = bW.toByteArray();\n" +
                "        var L = 0;\n" +
                "        while (L < t.length && t[L] == 0) {++L\n" +
                "        }\n" +
                "        if (t.length - L != bY - 1 || t[L] != 2) {\n" +
                "            return null\n" +
                "        }++L;\n" +
                "        while (t[L] != 0) {\n" +
                "            if (++L >= t.length) {\n" +
                "                return null\n" +
                "            }\n" +
                "        }\n" +
                "        var z = \"\";\n" +
                "        while (++L < t.length) {\n" +
                "            var bX = t[L] & 255;\n" +
                "            if (bX < 128) {\n" +
                "                z += String.fromCharCode(bX)\n" +
                "            } else {\n" +
                "                if ((bX > 191) && (bX < 224)) {\n" +
                "                    z += String.fromCharCode(((bX & 31) << 6) | (t[L + 1] & 63)); ++L\n" +
                "                } else {\n" +
                "                    z += String.fromCharCode(((bX & 15) << 12) | ((t[L + 1] & 63) << 6) | (t[L + 2] & 63));\n" +
                "                    L += 2\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        return z\n" +
                "    }\n" +
                "    function aC(L, t, z) {\n" +
                "        if (L != null && t != null && L.length > 0 && t.length > 0) {\n" +
                "            this.n = w(L, 16);\n" +
                "            this.e = parseInt(t, 16);\n" +
                "            this.d = w(z, 16)\n" +
                "        } else {\n" +
                "            console.error(\"Invalid RSA private key\")\n" +
                "        }\n" +
                "    }\n" +
                "    function O(bZ, bW, bX, L, z, t, b0, bY) {\n" +
                "        if (bZ != null && bW != null && bZ.length > 0 && bW.length > 0) {\n" +
                "            this.n = w(bZ, 16);\n" +
                "            this.e = parseInt(bW, 16);\n" +
                "            this.d = w(bX, 16);\n" +
                "            this.p = w(L, 16);\n" +
                "            this.q = w(z, 16);\n" +
                "            this.dmp1 = w(t, 16);\n" +
                "            this.dmq1 = w(b0, 16);\n" +
                "            this.coeff = w(bY, 16)\n" +
                "        } else {\n" +
                "            console.error(\"Invalid RSA private key\")\n" +
                "        }\n" +
                "    }\n" +
                "    function ax(L, b2) {\n" +
                "        var z = new G();\n" +
                "        var bZ = L >> 1;\n" +
                "        this.e = parseInt(b2, 16);\n" +
                "        var bW = new bf(b2, 16);\n" +
                "        for (;;) {\n" +
                "            for (;;) {\n" +
                "                this.p = new bf(L - bZ, 1, z);\n" +
                "                if (this.p.subtract(bf.ONE).gcd(bW).compareTo(bf.ONE) == 0 && this.p.isProbablePrime(10)) {\n" +
                "                    break\n" +
                "                }\n" +
                "            }\n" +
                "            for (;;) {\n" +
                "                this.q = new bf(bZ, 1, z);\n" +
                "                if (this.q.subtract(bf.ONE).gcd(bW).compareTo(bf.ONE) == 0 && this.q.isProbablePrime(10)) {\n" +
                "                    break\n" +
                "                }\n" +
                "            }\n" +
                "            if (this.p.compareTo(this.q) <= 0) {\n" +
                "                var b1 = this.p;\n" +
                "                this.p = this.q;\n" +
                "                this.q = b1\n" +
                "            }\n" +
                "            var b0 = this.p.subtract(bf.ONE);\n" +
                "            var bX = this.q.subtract(bf.ONE);\n" +
                "            var bY = b0.multiply(bX);\n" +
                "            if (bY.gcd(bW).compareTo(bf.ONE) == 0) {\n" +
                "                this.n = this.p.multiply(this.q);\n" +
                "                this.d = bW.modInverse(bY);\n" +
                "                this.dmp1 = this.d.mod(b0);\n" +
                "                this.dmq1 = this.d.mod(bX);\n" +
                "                this.coeff = this.q.modInverse(this.p);\n" +
                "                break\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    function ay(t) {\n" +
                "        if (this.p == null || this.q == null) {\n" +
                "            return t.modPow(this.d, this.n)\n" +
                "        }\n" +
                "        var L = t.mod(this.p).modPow(this.dmp1, this.p);\n" +
                "        var z = t.mod(this.q).modPow(this.dmq1, this.q);\n" +
                "        while (L.compareTo(z) < 0) {\n" +
                "            L = L.add(this.p)\n" +
                "        }\n" +
                "        return L.subtract(z).multiply(this.coeff).mod(this.p).multiply(this.q).add(z)\n" +
                "    }\n" +
                "    function r(z) {\n" +
                "        var L = w(z, 16);\n" +
                "        var t = this.doPrivate(L);\n" +
                "        if (t == null) {\n" +
                "            return null\n" +
                "        }\n" +
                "        return bo(t, (this.n.bitLength() + 7) >> 3)\n" +
                "    }\n" +
                "    A.prototype.doPrivate = ay;\n" +
                "    A.prototype.setPrivate = aC;\n" +
                "    A.prototype.setPrivateEx = O;\n" +
                "    A.prototype.generate = ax;\n" +
                "    A.prototype.decrypt = r; (function() {\n" +
                "        var z = function(b3, b1, b2) {\n" +
                "            var bZ = new G();\n" +
                "            var bW = b3 >> 1;\n" +
                "            this.e = parseInt(b1, 16);\n" +
                "            var bY = new bf(b1, 16);\n" +
                "            var b0 = this;\n" +
                "            var bX = function() {\n" +
                "                var b5 = function() {\n" +
                "                    if (b0.p.compareTo(b0.q) <= 0) {\n" +
                "                        var b8 = b0.p;\n" +
                "                        b0.p = b0.q;\n" +
                "                        b0.q = b8\n" +
                "                    }\n" +
                "                    var ca = b0.p.subtract(bf.ONE);\n" +
                "                    var b7 = b0.q.subtract(bf.ONE);\n" +
                "                    var b9 = ca.multiply(b7);\n" +
                "                    if (b9.gcd(bY).compareTo(bf.ONE) == 0) {\n" +
                "                        b0.n = b0.p.multiply(b0.q);\n" +
                "                        b0.d = bY.modInverse(b9);\n" +
                "                        b0.dmp1 = b0.d.mod(ca);\n" +
                "                        b0.dmq1 = b0.d.mod(b7);\n" +
                "                        b0.coeff = b0.q.modInverse(b0.p);\n" +
                "                        setTimeout(function() {\n" +
                "                            b2()\n" +
                "                        },\n" +
                "                        0)\n" +
                "                    } else {\n" +
                "                        setTimeout(bX, 0)\n" +
                "                    }\n" +
                "                };\n" +
                "                var b6 = function() {\n" +
                "                    b0.q = bm();\n" +
                "                    b0.q.fromNumberAsync(bW, 1, bZ,\n" +
                "                    function() {\n" +
                "                        b0.q.subtract(bf.ONE).gcda(bY,\n" +
                "                        function(b7) {\n" +
                "                            if (b7.compareTo(bf.ONE) == 0 && b0.q.isProbablePrime(10)) {\n" +
                "                                setTimeout(b5, 0)\n" +
                "                            } else {\n" +
                "                                setTimeout(b6, 0)\n" +
                "                            }\n" +
                "                        })\n" +
                "                    })\n" +
                "                };\n" +
                "                var b4 = function() {\n" +
                "                    b0.p = bm();\n" +
                "                    b0.p.fromNumberAsync(b3 - bW, 1, bZ,\n" +
                "                    function() {\n" +
                "                        b0.p.subtract(bf.ONE).gcda(bY,\n" +
                "                        function(b7) {\n" +
                "                            if (b7.compareTo(bf.ONE) == 0 && b0.p.isProbablePrime(10)) {\n" +
                "                                setTimeout(b6, 0)\n" +
                "                            } else {\n" +
                "                                setTimeout(b4, 0)\n" +
                "                            }\n" +
                "                        })\n" +
                "                    })\n" +
                "                };\n" +
                "                setTimeout(b4, 0)\n" +
                "            };\n" +
                "            setTimeout(bX, 0)\n" +
                "        };\n" +
                "        A.prototype.generateAsync = z;\n" +
                "        var t = function(bX, b3) {\n" +
                "            var bW = (this.s < 0) ? this.negate() : this.clone();\n" +
                "            var b2 = (bX.s < 0) ? bX.negate() : bX.clone();\n" +
                "            if (bW.compareTo(b2) < 0) {\n" +
                "                var bZ = bW;\n" +
                "                bW = b2;\n" +
                "                b2 = bZ\n" +
                "            }\n" +
                "            var bY = bW.getLowestSetBit(),\n" +
                "            b0 = b2.getLowestSetBit();\n" +
                "            if (b0 < 0) {\n" +
                "                b3(bW);\n" +
                "                return\n" +
                "            }\n" +
                "            if (bY < b0) {\n" +
                "                b0 = bY\n" +
                "            }\n" +
                "            if (b0 > 0) {\n" +
                "                bW.rShiftTo(b0, bW);\n" +
                "                b2.rShiftTo(b0, b2)\n" +
                "            }\n" +
                "            var b1 = function() {\n" +
                "                if ((bY = bW.getLowestSetBit()) > 0) {\n" +
                "                    bW.rShiftTo(bY, bW)\n" +
                "                }\n" +
                "                if ((bY = b2.getLowestSetBit()) > 0) {\n" +
                "                    b2.rShiftTo(bY, b2)\n" +
                "                }\n" +
                "                if (bW.compareTo(b2) >= 0) {\n" +
                "                    bW.subTo(b2, bW);\n" +
                "                    bW.rShiftTo(1, bW)\n" +
                "                } else {\n" +
                "                    b2.subTo(bW, b2);\n" +
                "                    b2.rShiftTo(1, b2)\n" +
                "                }\n" +
                "                if (! (bW.signum() > 0)) {\n" +
                "                    if (b0 > 0) {\n" +
                "                        b2.lShiftTo(b0, b2)\n" +
                "                    }\n" +
                "                    setTimeout(function() {\n" +
                "                        b3(b2)\n" +
                "                    },\n" +
                "                    0)\n" +
                "                } else {\n" +
                "                    setTimeout(b1, 0)\n" +
                "                }\n" +
                "            };\n" +
                "            setTimeout(b1, 10)\n" +
                "        };\n" +
                "        bf.prototype.gcda = t;\n" +
                "        var L = function(b0, bX, b3, b2) {\n" +
                "            if (\"number\" == typeof bX) {\n" +
                "                if (b0 < 2) {\n" +
                "                    this.fromInt(1)\n" +
                "                } else {\n" +
                "                    this.fromNumber(b0, b3);\n" +
                "                    if (!this.testBit(b0 - 1)) {\n" +
                "                        this.bitwiseTo(bf.ONE.shiftLeft(b0 - 1), ak, this)\n" +
                "                    }\n" +
                "                    if (this.isEven()) {\n" +
                "                        this.dAddOffset(1, 0)\n" +
                "                    }\n" +
                "                    var bZ = this;\n" +
                "                    var bY = function() {\n" +
                "                        bZ.dAddOffset(2, 0);\n" +
                "                        if (bZ.bitLength() > b0) {\n" +
                "                            bZ.subTo(bf.ONE.shiftLeft(b0 - 1), bZ)\n" +
                "                        }\n" +
                "                        if (bZ.isProbablePrime(bX)) {\n" +
                "                            setTimeout(function() {\n" +
                "                                b2()\n" +
                "                            },\n" +
                "                            0)\n" +
                "                        } else {\n" +
                "                            setTimeout(bY, 0)\n" +
                "                        }\n" +
                "                    };\n" +
                "                    setTimeout(bY, 0)\n" +
                "                }\n" +
                "            } else {\n" +
                "                var bW = new Array(),\n" +
                "                b1 = b0 & 7;\n" +
                "                bW.length = (b0 >> 3) + 1;\n" +
                "                bX.nextBytes(bW);\n" +
                "                if (b1 > 0) {\n" +
                "                    bW[0] &= ((1 << b1) - 1)\n" +
                "                } else {\n" +
                "                    bW[0] = 0\n" +
                "                }\n" +
                "                this.fromString(bW, 256)\n" +
                "            }\n" +
                "        };\n" +
                "        bf.prototype.fromNumberAsync = L\n" +
                "    })();\n" +
                "    var a4 = \"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/\";\n" +
                "    var J = \"=\";\n" +
                "    function ae(L) {\n" +
                "        var z;\n" +
                "        var bW;\n" +
                "        var t = \"\";\n" +
                "        for (z = 0; z + 3 <= L.length; z += 3) {\n" +
                "            bW = parseInt(L.substring(z, z + 3), 16);\n" +
                "            t += a4.charAt(bW >> 6) + a4.charAt(bW & 63)\n" +
                "        }\n" +
                "        if (z + 1 == L.length) {\n" +
                "            bW = parseInt(L.substring(z, z + 1), 16);\n" +
                "            t += a4.charAt(bW << 2)\n" +
                "        } else {\n" +
                "            if (z + 2 == L.length) {\n" +
                "                bW = parseInt(L.substring(z, z + 2), 16);\n" +
                "                t += a4.charAt(bW >> 2) + a4.charAt((bW & 3) << 4)\n" +
                "            }\n" +
                "        }\n" +
                "        while ((t.length & 3) > 0) {\n" +
                "            t += J\n" +
                "        }\n" +
                "        return t\n" +
                "    }\n" +
                "    function aW(bX) {\n" +
                "        var L = \"\";\n" +
                "        var bW;\n" +
                "        var t = 0;\n" +
                "        var z;\n" +
                "        for (bW = 0; bW < bX.length; ++bW) {\n" +
                "            if (bX.charAt(bW) == J) {\n" +
                "                break\n" +
                "            }\n" +
                "            v = a4.indexOf(bX.charAt(bW));\n" +
                "            if (v < 0) {\n" +
                "                continue\n" +
                "            }\n" +
                "            if (t == 0) {\n" +
                "                L += Y(v >> 2);\n" +
                "                z = v & 3;\n" +
                "                t = 1\n" +
                "            } else {\n" +
                "                if (t == 1) {\n" +
                "                    L += Y((z << 2) | (v >> 4));\n" +
                "                    z = v & 15;\n" +
                "                    t = 2\n" +
                "                } else {\n" +
                "                    if (t == 2) {\n" +
                "                        L += Y(z);\n" +
                "                        L += Y(v >> 2);\n" +
                "                        z = v & 3;\n" +
                "                        t = 3\n" +
                "                    } else {\n" +
                "                        L += Y((z << 2) | (v >> 4));\n" +
                "                        L += Y(v & 15);\n" +
                "                        t = 0\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        if (t == 1) {\n" +
                "            L += Y(z << 2)\n" +
                "        }\n" +
                "        return L\n" +
                "    }\n" +
                "    function M(bW) {\n" +
                "        var L = aW(bW);\n" +
                "        var z;\n" +
                "        var t = new Array();\n" +
                "        for (z = 0; 2 * z < L.length; ++z) {\n" +
                "            t[z] = parseInt(L.substring(2 * z, 2 * z + 2), 16)\n" +
                "        }\n" +
                "        return t\n" +
                "    }\n" +
                "    ;\n" +
                "    var at = at || {};\n" +
                "    at.env = at.env || {};\n" +
                "    var bn = at,\n" +
                "    aw = Object.prototype,\n" +
                "    ar = \"[object Function]\",\n" +
                "    X = [\"toString\", \"valueOf\"];\n" +
                "    at.env.parseUA = function(bW) {\n" +
                "        var bX = function(b1) {\n" +
                "            var b2 = 0;\n" +
                "            return parseFloat(b1.replace(/\\./g,\n" +
                "            function() {\n" +
                "                return (b2++==1) ? \"\": \".\"\n" +
                "            }))\n" +
                "        },\n" +
                "        bZ = {       \n" +
                "  \t\t\tie: 0,\n" +
                "            opera: 0,\n" +
                "            gecko: 0,\n" +
                "            webkit: 0,\n" +
                "            chrome: 0,\n" +
                "            mobile: null,\n" +
                "            air: 0,\n" +
                "            ipad: 0,\n" +
                "            iphone: 0,\n" +
                "            ipod: 0,\n" +
                "            ios: null,\n" +
                "            android: 0,\n" +
                "            webos: 0,\n" +
                "            secure: false,\n" +
                "            os: null\n" +
                "        },\n" +
                "\t\tL = \"Mozilla/5.0 (Windows NT 10.0; WOW64; rv:59.0) Gecko/20100101 Firefox/59.0\",  //替换从浏览器得到的内容\n" +
                "        t;\n" +
                "        if (L) {\n" +
                "        \tbZ.os = \"windows\";\n" +
                "            if ((/KHTML/).test(L)) {\n" +
                "                bZ.webkit = 1\n" +
                "            }\n" +
                "            t = L.match(/AppleWebKit\\/([^\\s]*)/);\n" +
                "            if (t && t[1]) {\n" +
                "                bZ.webkit = bX(t[1]);\n" +
                "                if (/ Mobile\\//.test(L)) {\n" +
                "                    bZ.mobile = \"Apple\";\n" +
                "                    t = L.match(/OS ([^\\s]*)/);\n" +
                "                    if (t && t[1]) {\n" +
                "                        t = bX(t[1].replace(\"_\", \".\"))\n" +
                "                    }\n" +
                "                    bZ.ios = t;\n" +
                "                    bZ.ipad = bZ.ipod = bZ.iphone = 0;\n" +
                "                    t = L.match(/iPad|iPod|iPhone/);\n" +
                "                    if (t && t[0]) {\n" +
                "                        bZ[t[0].toLowerCase()] = bZ.ios\n" +
                "                    }\n" +
                "                } else {\n" +
                "                    t = L.match(/NokiaN[^\\/]*|Android \\d\\.\\d|webOS\\/\\d\\.\\d/);\n" +
                "                    if (t) {\n" +
                "                        bZ.mobile = t[0]\n" +
                "                    }\n" +
                "                    if (/webOS/.test(L)) {\n" +
                "                        bZ.mobile = \"WebOS\";\n" +
                "                        t = L.match(/webOS\\/([^\\s]*);/);\n" +
                "                        if (t && t[1]) {\n" +
                "                            bZ.webos = bX(t[1])\n" +
                "                        }\n" +
                "                    }\n" +
                "                    if (/ Android/.test(L)) {\n" +
                "                        bZ.mobile = \"Android\";\n" +
                "                        t = L.match(/Android ([^\\s]*);/);\n" +
                "                        if (t && t[1]) {\n" +
                "                            bZ.android = bX(t[1])\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "                t = L.match(/Chrome\\/([^\\s]*)/);\n" +
                "                if (t && t[1]) {\n" +
                "                    bZ.chrome = bX(t[1])\n" +
                "                } else {\n" +
                "                    t = L.match(/AdobeAIR\\/([^\\s]*)/);\n" +
                "                    if (t) {\n" +
                "                        bZ.air = t[0]\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "            if (!bZ.webkit) {\n" +
                "                t = L.match(/Opera[\\s\\/]([^\\s]*)/);\n" +
                "                if (t && t[1]) {\n" +
                "                    bZ.opera = bX(t[1]);\n" +
                "                    t = L.match(/Version\\/([^\\s]*)/);\n" +
                "                    if (t && t[1]) {\n" +
                "                        bZ.opera = bX(t[1])\n" +
                "                    }\n" +
                "                    t = L.match(/Opera Mini[^;]*/);\n" +
                "                    if (t) {\n" +
                "                        bZ.mobile = t[0]\n" +
                "                    }\n" +
                "                } else {\n" +
                "                    t = L.match(/MSIE\\s([^;]*)/);\n" +
                "                    if (t && t[1]) {\n" +
                "                        bZ.ie = bX(t[1])\n" +
                "                    } else {\n" +
                "                        t = L.match(/Gecko\\/([^\\s]*)/);\n" +
                "                        if (t) {\n" +
                "                            bZ.gecko = 1;\n" +
                "                            t = L.match(/rv:([^\\s\\)]*)/);\n" +
                "                            if (t && t[1]) {\n" +
                "                                bZ.gecko = bX(t[1])\n" +
                "                            }\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        return bZ;\n" +
                "    };\n" +
                "    at.env.ua = at.env.parseUA();\n" +
                "    at.isFunction = function(t) {\n" +
                "        return (typeof t === \"function\") || aw.toString.apply(t) === ar\n" +
                "    };\n" +
                "    at._IEEnumFix = (at.env.ua.ie) ?\n" +
                "    function(L, z) {\n" +
                "        var t, bX, bW;\n" +
                "        for (t = 0; t < X.length; t = t + 1) {\n" +
                "            bX = X[t];\n" +
                "            bW = z[bX];\n" +
                "            if (bn.isFunction(bW) && bW != aw[bX]) {\n" +
                "                L[bX] = bW\n" +
                "            }\n" +
                "        }\n" +
                "    }: function() {};\n" +
                "    at.extend = function(bW, bX, L) {\n" +
                "        if (!bX || !bW) {\n" +
                "            throw new Error(\"extend failed, please check that all dependencies are included.\")\n" +
                "        }\n" +
                "        var z = function() {},\n" +
                "        t;\n" +
                "        z.prototype = bX.prototype;\n" +
                "        bW.prototype = new z();\n" +
                "        bW.prototype.constructor = bW;\n" +
                "        bW.superclass = bX.prototype;\n" +
                "        if (bX.prototype.constructor == aw.constructor) {\n" +
                "            bX.prototype.constructor = bX\n" +
                "        }\n" +
                "        if (L) {\n" +
                "            for (t in L) {\n" +
                "                if (bn.hasOwnProperty(L, t)) {\n" +
                "                    bW.prototype[t] = L[t]\n" +
                "                }\n" +
                "            }\n" +
                "            bn._IEEnumFix(bW.prototype, L)\n" +
                "        }\n" +
                "    };\n" +
                "    if (typeof KJUR == \"undefined\" || !KJUR) {\n" +
                "        KJUR = {}\n" +
                "    }\n" +
                "    if (typeof KJUR.asn1 == \"undefined\" || !KJUR.asn1) {\n" +
                "        KJUR.asn1 = {}\n" +
                "    }\n" +
                "    KJUR.asn1.ASN1Util = new\n" +
                "    function() {\n" +
                "        this.integerToByteHex = function(t) {\n" +
                "            var z = t.toString(16);\n" +
                "            if ((z.length % 2) == 1) {\n" +
                "                z = \"0\" + z\n" +
                "            }\n" +
                "            return z\n" +
                "        };\n" +
                "        this.bigIntToMinTwosComplementsHex = function(b0) {\n" +
                "            var bY = b0.toString(16);\n" +
                "            if (bY.substr(0, 1) != \"-\") {\n" +
                "                if (bY.length % 2 == 1) {\n" +
                "                    bY = \"0\" + bY\n" +
                "                } else {\n" +
                "                    if (!bY.match(/^[0-7]/)) {\n" +
                "                        bY = \"00\" + bY\n" +
                "                    }\n" +
                "                }\n" +
                "            } else {\n" +
                "                var t = bY.substr(1);\n" +
                "                var bX = t.length;\n" +
                "                if (bX % 2 == 1) {\n" +
                "                    bX += 1\n" +
                "                } else {\n" +
                "                    if (!bY.match(/^[0-7]/)) {\n" +
                "                        bX += 2\n" +
                "                    }\n" +
                "                }\n" +
                "                var bZ = \"\";\n" +
                "                for (var bW = 0; bW < bX; bW++) {\n" +
                "                    bZ += \"f\"\n" +
                "                }\n" +
                "                var L = new bf(bZ, 16);\n" +
                "                var z = L.xor(b0).add(bf.ONE);\n" +
                "                bY = z.toString(16).replace(/^-/, \"\")\n" +
                "            }\n" +
                "            return bY\n" +
                "        };\n" +
                "        this.getPEMStringFromHex = function(t, z) {\n" +
                "            var bX = CryptoJS.enc.Hex.parse(t);\n" +
                "            var L = CryptoJS.enc.Base64.stringify(bX);\n" +
                "            var bW = L.replace(/(.{64})/g, \"$1\\r\\n\");\n" +
                "            bW = bW.replace(/\\r\\n$/, \"\");\n" +
                "            return \"-----BEGIN \" + z + \"-----\\r\\n\" + bW + \"\\r\\n-----END \" + z + \"-----\\r\\n\"\n" +
                "        }\n" +
                "    };\n" +
                "    KJUR.asn1.ASN1Object = function() {\n" +
                "        var L = true;\n" +
                "        var z = null;\n" +
                "        var bW = \"00\";\n" +
                "        var bX = \"00\";\n" +
                "        var t = \"\";\n" +
                "        this.getLengthHexFromValue = function() {\n" +
                "            if (typeof this.hV == \"undefined\" || this.hV == null) {\n" +
                "                throw \"this.hV is null or undefined.\"\n" +
                "            }\n" +
                "            if (this.hV.length % 2 == 1) {\n" +
                "                throw \"value hex must be even length: n=\" + t.length + \",v=\" + this.hV\n" +
                "            }\n" +
                "            var b1 = this.hV.length / 2;\n" +
                "            var b0 = b1.toString(16);\n" +
                "            if (b0.length % 2 == 1) {\n" +
                "                b0 = \"0\" + b0\n" +
                "            }\n" +
                "            if (b1 < 128) {\n" +
                "                return b0\n" +
                "            } else {\n" +
                "                var bZ = b0.length / 2;\n" +
                "                if (bZ > 15) {\n" +
                "                    throw \"ASN.1 length too long to represent by 8x: n = \" + b1.toString(16)\n" +
                "                }\n" +
                "                var bY = 128 + bZ;\n" +
                "                return bY.toString(16) + b0\n" +
                "            }\n" +
                "        };\n" +
                "        this.getEncodedHex = function() {\n" +
                "            if (this.hTLV == null || this.isModified) {\n" +
                "                this.hV = this.getFreshValueHex();\n" +
                "                this.hL = this.getLengthHexFromValue();\n" +
                "                this.hTLV = this.hT + this.hL + this.hV;\n" +
                "                this.isModified = false\n" +
                "            }\n" +
                "            return this.hTLV\n" +
                "        };\n" +
                "        this.getValueHex = function() {\n" +
                "            this.getEncodedHex();\n" +
                "            return this.hV\n" +
                "        };\n" +
                "        this.getFreshValueHex = function() {\n" +
                "            return \"\"\n" +
                "        }\n" +
                "    };\n" +
                "    KJUR.asn1.DERAbstractString = function(L) {\n" +
                "        KJUR.asn1.DERAbstractString.superclass.constructor.call(this);\n" +
                "        var z = null;\n" +
                "        var t = null;\n" +
                "        this.getString = function() {\n" +
                "            return this.s\n" +
                "        };\n" +
                "        this.setString = function(bW) {\n" +
                "            this.hTLV = null;\n" +
                "            this.isModified = true;\n" +
                "            this.s = bW;\n" +
                "            this.hV = stohex(this.s)\n" +
                "        };\n" +
                "        this.setStringHex = function(bW) {\n" +
                "            this.hTLV = null;\n" +
                "            this.isModified = true;\n" +
                "            this.s = null;\n" +
                "            this.hV = bW\n" +
                "        };\n" +
                "        this.getFreshValueHex = function() {\n" +
                "            return this.hV\n" +
                "        };\n" +
                "        if (typeof L != \"undefined\") {\n" +
                "            if (typeof L.str != \"undefined\") {\n" +
                "                this.setString(L.str)\n" +
                "            } else {\n" +
                "                if (typeof L.hex != \"undefined\") {\n" +
                "                    this.setStringHex(L.hex)\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERAbstractString, KJUR.asn1.ASN1Object);\n" +
                "    KJUR.asn1.DERAbstractTime = function(L) {\n" +
                "        KJUR.asn1.DERAbstractTime.superclass.constructor.call(this);\n" +
                "        var z = null;\n" +
                "        var t = null;\n" +
                "        this.localDateToUTC = function(bX) {\n" +
                "            utc = bX.getTime() + (bX.getTimezoneOffset() * 60000);\n" +
                "            var bW = new Date(utc);\n" +
                "            return bW\n" +
                "        };\n" +
                "        this.formatDate = function(b1, b3) {\n" +
                "            var bW = this.zeroPadding;\n" +
                "            var b2 = this.localDateToUTC(b1);\n" +
                "            var b4 = String(b2.getFullYear());\n" +
                "            if (b3 == \"utc\") {\n" +
                "                b4 = b4.substr(2, 2)\n" +
                "            }\n" +
                "            var b0 = bW(String(b2.getMonth() + 1), 2);\n" +
                "            var b5 = bW(String(b2.getDate()), 2);\n" +
                "            var bX = bW(String(b2.getHours()), 2);\n" +
                "            var bY = bW(String(b2.getMinutes()), 2);\n" +
                "            var bZ = bW(String(b2.getSeconds()), 2);\n" +
                "            return b4 + b0 + b5 + bX + bY + bZ + \"Z\"\n" +
                "        };\n" +
                "        this.zeroPadding = function(bX, bW) {\n" +
                "            if (bX.length >= bW) {\n" +
                "                return bX\n" +
                "            }\n" +
                "            return new Array(bW - bX.length + 1).join(\"0\") + bX\n" +
                "        };\n" +
                "        this.getString = function() {\n" +
                "            return this.s\n" +
                "        };\n" +
                "        this.setString = function(bW) {\n" +
                "            this.hTLV = null;\n" +
                "            this.isModified = true;\n" +
                "            this.s = bW;\n" +
                "            this.hV = stohex(this.s)\n" +
                "        };\n" +
                "        this.setByDateValue = function(b0, b2, bX, bW, bY, bZ) {\n" +
                "            var b1 = new Date(Date.UTC(b0, b2 - 1, bX, bW, bY, bZ, 0));\n" +
                "            this.setByDate(b1)\n" +
                "        };\n" +
                "        this.getFreshValueHex = function() {\n" +
                "            return this.hV\n" +
                "        }\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERAbstractTime, KJUR.asn1.ASN1Object);\n" +
                "    KJUR.asn1.DERAbstractStructured = function(z) {\n" +
                "        KJUR.asn1.DERAbstractString.superclass.constructor.call(this);\n" +
                "        var t = null;\n" +
                "        this.setByASN1ObjectArray = function(L) {\n" +
                "            this.hTLV = null;\n" +
                "            this.isModified = true;\n" +
                "            this.asn1Array = L\n" +
                "        };\n" +
                "        this.appendASN1Object = function(L) {\n" +
                "            this.hTLV = null;\n" +
                "            this.isModified = true;\n" +
                "            this.asn1Array.push(L)\n" +
                "        };\n" +
                "        this.asn1Array = new Array();\n" +
                "        if (typeof z != \"undefined\") {\n" +
                "            if (typeof z.array != \"undefined\") {\n" +
                "                this.asn1Array = z.array\n" +
                "            }\n" +
                "        }\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERAbstractStructured, KJUR.asn1.ASN1Object);\n" +
                "    KJUR.asn1.DERBoolean = function() {\n" +
                "        KJUR.asn1.DERBoolean.superclass.constructor.call(this);\n" +
                "        this.hT = \"01\";\n" +
                "        this.hTLV = \"0101ff\"\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERBoolean, KJUR.asn1.ASN1Object);\n" +
                "    KJUR.asn1.DERInteger = function(t) {\n" +
                "        KJUR.asn1.DERInteger.superclass.constructor.call(this);\n" +
                "        this.hT = \"02\";\n" +
                "        this.setByBigInteger = function(z) {\n" +
                "            this.hTLV = null;\n" +
                "            this.isModified = true;\n" +
                "            this.hV = KJUR.asn1.ASN1Util.bigIntToMinTwosComplementsHex(z)\n" +
                "        };\n" +
                "        this.setByInteger = function(L) {\n" +
                "            var z = new bf(String(L), 10);\n" +
                "            this.setByBigInteger(z)\n" +
                "        };\n" +
                "        this.setValueHex = function(z) {\n" +
                "            this.hV = z\n" +
                "        };\n" +
                "        this.getFreshValueHex = function() {\n" +
                "            return this.hV\n" +
                "        };\n" +
                "        if (typeof t != \"undefined\") {\n" +
                "            if (typeof t.bigint != \"undefined\") {\n" +
                "                this.setByBigInteger(t.bigint)\n" +
                "            } else {\n" +
                "                if (typeof t[\"int\"] != \"undefined\") {\n" +
                "                    this.setByInteger(t[\"int\"])\n" +
                "                } else {\n" +
                "                    if (typeof t.hex != \"undefined\") {\n" +
                "                        this.setValueHex(t.hex)\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERInteger, KJUR.asn1.ASN1Object);\n" +
                "    KJUR.asn1.DERBitString = function(t) {\n" +
                "        KJUR.asn1.DERBitString.superclass.constructor.call(this);\n" +
                "        this.hT = \"03\";\n" +
                "        this.setHexValueIncludingUnusedBits = function(z) {\n" +
                "            this.hTLV = null;\n" +
                "            this.isModified = true;\n" +
                "            this.hV = z\n" +
                "        };\n" +
                "        this.setUnusedBitsAndHexValue = function(z, bW) {\n" +
                "            if (z < 0 || 7 < z) {\n" +
                "                throw \"unused bits shall be from 0 to 7: u = \" + z\n" +
                "            }\n" +
                "            var L = \"0\" + z;\n" +
                "            this.hTLV = null;\n" +
                "            this.isModified = true;\n" +
                "            this.hV = L + bW\n" +
                "        };\n" +
                "        this.setByBinaryString = function(bW) {\n" +
                "            bW = bW.replace(/0+$/, \"\");\n" +
                "            var bX = 8 - bW.length % 8;\n" +
                "            if (bX == 8) {\n" +
                "                bX = 0\n" +
                "            }\n" +
                "            for (var bY = 0; bY <= bX; bY++) {\n" +
                "                bW += \"0\"\n" +
                "            }\n" +
                "            var bZ = \"\";\n" +
                "            for (var bY = 0; bY < bW.length - 1; bY += 8) {\n" +
                "                var L = bW.substr(bY, 8);\n" +
                "                var z = parseInt(L, 2).toString(16);\n" +
                "                if (z.length == 1) {\n" +
                "                    z = \"0\" + z\n" +
                "                }\n" +
                "                bZ += z\n" +
                "            }\n" +
                "            this.hTLV = null;\n" +
                "            this.isModified = true;\n" +
                "            this.hV = \"0\" + bX + bZ\n" +
                "        };\n" +
                "        this.setByBooleanArray = function(bW) {\n" +
                "            var L = \"\";\n" +
                "            for (var z = 0; z < bW.length; z++) {\n" +
                "                if (bW[z] == true) {\n" +
                "                    L += \"1\"\n" +
                "                } else {\n" +
                "                    L += \"0\"\n" +
                "                }\n" +
                "            }\n" +
                "            this.setByBinaryString(L)\n" +
                "        };\n" +
                "        this.newFalseArray = function(bW) {\n" +
                "            var z = new Array(bW);\n" +
                "            for (var L = 0; L < bW; L++) {\n" +
                "                z[L] = false\n" +
                "            }\n" +
                "            return z\n" +
                "        };\n" +
                "        this.getFreshValueHex = function() {\n" +
                "            return this.hV\n" +
                "        };\n" +
                "        if (typeof t != \"undefined\") {\n" +
                "            if (typeof t.hex != \"undefined\") {\n" +
                "                this.setHexValueIncludingUnusedBits(t.hex)\n" +
                "            } else {\n" +
                "                if (typeof t.bin != \"undefined\") {\n" +
                "                    this.setByBinaryString(t.bin)\n" +
                "                } else {\n" +
                "                    if (typeof t.array != \"undefined\") {\n" +
                "                        this.setByBooleanArray(t.array)\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERBitString, KJUR.asn1.ASN1Object);\n" +
                "    KJUR.asn1.DEROctetString = function(t) {\n" +
                "        KJUR.asn1.DEROctetString.superclass.constructor.call(this, t);\n" +
                "        this.hT = \"04\"\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DEROctetString, KJUR.asn1.DERAbstractString);\n" +
                "    KJUR.asn1.DERNull = function() {\n" +
                "        KJUR.asn1.DERNull.superclass.constructor.call(this);\n" +
                "        this.hT = \"05\";\n" +
                "        this.hTLV = \"0500\"\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERNull, KJUR.asn1.ASN1Object);\n" +
                "    KJUR.asn1.DERObjectIdentifier = function(L) {\n" +
                "        var z = function(bW) {\n" +
                "            var bX = bW.toString(16);\n" +
                "            if (bX.length == 1) {\n" +
                "                bX = \"0\" + bX\n" +
                "            }\n" +
                "            return bX\n" +
                "        };\n" +
                "        var t = function(b1) {\n" +
                "            var b0 = \"\";\n" +
                "            var bX = new bf(b1, 10);\n" +
                "            var bW = bX.toString(2);\n" +
                "            var bY = 7 - bW.length % 7;\n" +
                "            if (bY == 7) {\n" +
                "                bY = 0\n" +
                "            }\n" +
                "            var b3 = \"\";\n" +
                "            for (var bZ = 0; bZ < bY; bZ++) {\n" +
                "                b3 += \"0\"\n" +
                "            }\n" +
                "            bW = b3 + bW;\n" +
                "            for (var bZ = 0; bZ < bW.length - 1; bZ += 7) {\n" +
                "                var b2 = bW.substr(bZ, 7);\n" +
                "                if (bZ != bW.length - 7) {\n" +
                "                    b2 = \"1\" + b2\n" +
                "                }\n" +
                "                b0 += z(parseInt(b2, 2))\n" +
                "            }\n" +
                "            return b0\n" +
                "        };\n" +
                "        KJUR.asn1.DERObjectIdentifier.superclass.constructor.call(this);\n" +
                "        this.hT = \"06\";\n" +
                "        this.setValueHex = function(bW) {\n" +
                "            this.hTLV = null;\n" +
                "            this.isModified = true;\n" +
                "            this.s = null;\n" +
                "            this.hV = bW\n" +
                "        };\n" +
                "        this.setValueOidString = function(bY) {\n" +
                "            if (!bY.match(/^[0-9.]+$/)) {\n" +
                "                throw \"malformed oid string: \" + bY\n" +
                "            }\n" +
                "            var bZ = \"\";\n" +
                "            var bW = bY.split(\".\");\n" +
                "            var b0 = parseInt(bW[0]) * 40 + parseInt(bW[1]);\n" +
                "            bZ += z(b0);\n" +
                "            bW.splice(0, 2);\n" +
                "            for (var bX = 0; bX < bW.length; bX++) {\n" +
                "                bZ += t(bW[bX])\n" +
                "            }\n" +
                "            this.hTLV = null;\n" +
                "            this.isModified = true;\n" +
                "            this.s = null;\n" +
                "            this.hV = bZ\n" +
                "        };\n" +
                "        this.setValueName = function(bX) {\n" +
                "            if (typeof KJUR.asn1.x509.OID.name2oidList[bX] != \"undefined\") {\n" +
                "                var bW = KJUR.asn1.x509.OID.name2oidList[bX];\n" +
                "                this.setValueOidString(bW)\n" +
                "            } else {\n" +
                "                throw \"DERObjectIdentifier oidName undefined: \" + bX\n" +
                "            }\n" +
                "        };\n" +
                "        this.getFreshValueHex = function() {\n" +
                "            return this.hV\n" +
                "        };\n" +
                "        if (typeof L != \"undefined\") {\n" +
                "            if (typeof L.oid != \"undefined\") {\n" +
                "                this.setValueOidString(L.oid)\n" +
                "            } else {\n" +
                "                if (typeof L.hex != \"undefined\") {\n" +
                "                    this.setValueHex(L.hex)\n" +
                "                } else {\n" +
                "                    if (typeof L.name != \"undefined\") {\n" +
                "                        this.setValueName(L.name)\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERObjectIdentifier, KJUR.asn1.ASN1Object);\n" +
                "    KJUR.asn1.DERUTF8String = function(t) {\n" +
                "        KJUR.asn1.DERUTF8String.superclass.constructor.call(this, t);\n" +
                "        this.hT = \"0c\"\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERUTF8String, KJUR.asn1.DERAbstractString);\n" +
                "    KJUR.asn1.DERNumericString = function(t) {\n" +
                "        KJUR.asn1.DERNumericString.superclass.constructor.call(this, t);\n" +
                "        this.hT = \"12\"\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERNumericString, KJUR.asn1.DERAbstractString);\n" +
                "    KJUR.asn1.DERPrintableString = function(t) {\n" +
                "        KJUR.asn1.DERPrintableString.superclass.constructor.call(this, t);\n" +
                "        this.hT = \"13\"\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERPrintableString, KJUR.asn1.DERAbstractString);\n" +
                "    KJUR.asn1.DERTeletexString = function(t) {\n" +
                "        KJUR.asn1.DERTeletexString.superclass.constructor.call(this, t);\n" +
                "        this.hT = \"14\"\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERTeletexString, KJUR.asn1.DERAbstractString);\n" +
                "    KJUR.asn1.DERIA5String = function(t) {\n" +
                "        KJUR.asn1.DERIA5String.superclass.constructor.call(this, t);\n" +
                "        this.hT = \"16\"\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERIA5String, KJUR.asn1.DERAbstractString);\n" +
                "    KJUR.asn1.DERUTCTime = function(t) {\n" +
                "        KJUR.asn1.DERUTCTime.superclass.constructor.call(this, t);\n" +
                "        this.hT = \"17\";\n" +
                "        this.setByDate = function(z) {\n" +
                "            this.hTLV = null;\n" +
                "            this.isModified = true;\n" +
                "            this.date = z;\n" +
                "            this.s = this.formatDate(this.date, \"utc\");\n" +
                "            this.hV = stohex(this.s)\n" +
                "        };\n" +
                "        if (typeof t != \"undefined\") {\n" +
                "            if (typeof t.str != \"undefined\") {\n" +
                "                this.setString(t.str)\n" +
                "            } else {\n" +
                "                if (typeof t.hex != \"undefined\") {\n" +
                "                    this.setStringHex(t.hex)\n" +
                "                } else {\n" +
                "                    if (typeof t.date != \"undefined\") {\n" +
                "                        this.setByDate(t.date)\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERUTCTime, KJUR.asn1.DERAbstractTime);\n" +
                "    KJUR.asn1.DERGeneralizedTime = function(t) {\n" +
                "        KJUR.asn1.DERGeneralizedTime.superclass.constructor.call(this, t);\n" +
                "        this.hT = \"18\";\n" +
                "        this.setByDate = function(z) {\n" +
                "            this.hTLV = null;\n" +
                "            this.isModified = true;\n" +
                "            this.date = z;\n" +
                "            this.s = this.formatDate(this.date, \"gen\");\n" +
                "            this.hV = stohex(this.s)\n" +
                "        };\n" +
                "        if (typeof t != \"undefined\") {\n" +
                "            if (typeof t.str != \"undefined\") {\n" +
                "                this.setString(t.str)\n" +
                "            } else {\n" +
                "                if (typeof t.hex != \"undefined\") {\n" +
                "                    this.setStringHex(t.hex)\n" +
                "                } else {\n" +
                "                    if (typeof t.date != \"undefined\") {\n" +
                "                        this.setByDate(t.date)\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERGeneralizedTime, KJUR.asn1.DERAbstractTime);\n" +
                "    KJUR.asn1.DERSequence = function(t) {\n" +
                "        KJUR.asn1.DERSequence.superclass.constructor.call(this, t);\n" +
                "        this.hT = \"30\";\n" +
                "        this.getFreshValueHex = function() {\n" +
                "            var L = \"\";\n" +
                "            for (var z = 0; z < this.asn1Array.length; z++) {\n" +
                "                var bW = this.asn1Array[z];\n" +
                "                L += bW.getEncodedHex()\n" +
                "            }\n" +
                "            this.hV = L;\n" +
                "            return this.hV\n" +
                "        }\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERSequence, KJUR.asn1.DERAbstractStructured);\n" +
                "    KJUR.asn1.DERSet = function(t) {\n" +
                "        KJUR.asn1.DERSet.superclass.constructor.call(this, t);\n" +
                "        this.hT = \"31\";\n" +
                "        this.getFreshValueHex = function() {\n" +
                "            var z = new Array();\n" +
                "            for (var L = 0; L < this.asn1Array.length; L++) {\n" +
                "                var bW = this.asn1Array[L];\n" +
                "                z.push(bW.getEncodedHex())\n" +
                "            }\n" +
                "            z.sort();\n" +
                "            this.hV = z.join(\"\");\n" +
                "            return this.hV\n" +
                "        }\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERSet, KJUR.asn1.DERAbstractStructured);\n" +
                "    KJUR.asn1.DERTaggedObject = function(t) {\n" +
                "        KJUR.asn1.DERTaggedObject.superclass.constructor.call(this);\n" +
                "        this.hT = \"a0\";\n" +
                "        this.hV = \"\";\n" +
                "        this.isExplicit = true;\n" +
                "        this.asn1Object = null;\n" +
                "        this.setASN1Object = function(z, L, bW) {\n" +
                "            this.hT = L;\n" +
                "            this.isExplicit = z;\n" +
                "            this.asn1Object = bW;\n" +
                "            if (this.isExplicit) {\n" +
                "                this.hV = this.asn1Object.getEncodedHex();\n" +
                "                this.hTLV = null;\n" +
                "                this.isModified = true\n" +
                "            } else {\n" +
                "                this.hV = null;\n" +
                "                this.hTLV = bW.getEncodedHex();\n" +
                "                this.hTLV = this.hTLV.replace(/^../, L);\n" +
                "                this.isModified = false\n" +
                "            }\n" +
                "        };\n" +
                "        this.getFreshValueHex = function() {\n" +
                "            return this.hV\n" +
                "        };\n" +
                "        if (typeof t != \"undefined\") {\n" +
                "            if (typeof t.tag != \"undefined\") {\n" +
                "                this.hT = t.tag\n" +
                "            }\n" +
                "            if (typeof t.explicit != \"undefined\") {\n" +
                "                this.isExplicit = t.explicit\n" +
                "            }\n" +
                "            if (typeof t.obj != \"undefined\") {\n" +
                "                this.asn1Object = t.obj;\n" +
                "                this.setASN1Object(this.isExplicit, this.hT, this.asn1Object)\n" +
                "            }\n" +
                "        }\n" +
                "    };\n" +
                "    at.extend(KJUR.asn1.DERTaggedObject, KJUR.asn1.ASN1Object); (function(z) {\n" +
                "        var t = {},\n" +
                "        L;\n" +
                "        t.decode = function(bW) {\n" +
                "            var bY;\n" +
                "            if (L === z) {\n" +
                "                var bZ = \"0123456789ABCDEF\",\n" +
                "                b3 = \" \\f\\n\\r\\t\\u00A0\\u2028\\u2029\";\n" +
                "                L = [];\n" +
                "                for (bY = 0; bY < 16; ++bY) {\n" +
                "                    L[bZ.charAt(bY)] = bY\n" +
                "                }\n" +
                "                bZ = bZ.toLowerCase();\n" +
                "                for (bY = 10; bY < 16; ++bY) {\n" +
                "                    L[bZ.charAt(bY)] = bY\n" +
                "                }\n" +
                "                for (bY = 0; bY < b3.length; ++bY) {\n" +
                "                    L[b3.charAt(bY)] = -1\n" +
                "                }\n" +
                "            }\n" +
                "            var bX = [],\n" +
                "            b0 = 0,\n" +
                "            b2 = 0;\n" +
                "            for (bY = 0; bY < bW.length; ++bY) {\n" +
                "                var b1 = bW.charAt(bY);\n" +
                "                if (b1 == \"=\") {\n" +
                "                    break\n" +
                "                }\n" +
                "                b1 = L[b1];\n" +
                "                if (b1 == -1) {\n" +
                "                    continue\n" +
                "                }\n" +
                "                if (b1 === z) {\n" +
                "                    throw \"Illegal character at offset \" + bY\n" +
                "                }\n" +
                "                b0 |= b1;\n" +
                "                if (++b2 >= 2) {\n" +
                "                    bX[bX.length] = b0;\n" +
                "                    b0 = 0;\n" +
                "                    b2 = 0\n" +
                "                } else {\n" +
                "                    b0 <<= 4\n" +
                "                }\n" +
                "            }\n" +
                "            if (b2) {\n" +
                "                throw \"Hex encoding incomplete: 4 bits missing\"\n" +
                "            }\n" +
                "            return bX\n" +
                "        };\n" +
                "//      window.Hex = t\n" +
                "    })(); (function(z) {\n" +
                "        var t = {},\n" +
                "        L;\n" +
                "        t.decode = function(bW) {\n" +
                "            var bZ;\n" +
                "            if (L === z) {\n" +
                "                var bY = \"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/\",\n" +
                "                b3 = \"= \\f\\n\\r\\t\\u00A0\\u2028\\u2029\";\n" +
                "                L = [];\n" +
                "                for (bZ = 0; bZ < 64; ++bZ) {\n" +
                "                    L[bY.charAt(bZ)] = bZ\n" +
                "                }\n" +
                "                for (bZ = 0; bZ < b3.length; ++bZ) {\n" +
                "                    L[b3.charAt(bZ)] = -1\n" +
                "                }\n" +
                "            }\n" +
                "            var bX = [];\n" +
                "            var b0 = 0,\n" +
                "            b2 = 0;\n" +
                "            for (bZ = 0; bZ < bW.length; ++bZ) {\n" +
                "                var b1 = bW.charAt(bZ);\n" +
                "                if (b1 == \"=\") {\n" +
                "                    break\n" +
                "                }\n" +
                "                b1 = L[b1];\n" +
                "                if (b1 == -1) {\n" +
                "                    continue\n" +
                "                }\n" +
                "                if (b1 === z) {\n" +
                "                    throw \"Illegal character at offset \" + bZ\n" +
                "                }\n" +
                "                b0 |= b1;\n" +
                "                if (++b2 >= 4) {\n" +
                "                    bX[bX.length] = (b0 >> 16);\n" +
                "                    bX[bX.length] = (b0 >> 8) & 255;\n" +
                "                    bX[bX.length] = b0 & 255;\n" +
                "                    b0 = 0;\n" +
                "                    b2 = 0\n" +
                "                } else {\n" +
                "                    b0 <<= 6\n" +
                "                }\n" +
                "            }\n" +
                "            switch (b2) {\n" +
                "            case 1:\n" +
                "                throw \"Base64 encoding incomplete: at least 2 bits missing\";\n" +
                "            case 2:\n" +
                "                bX[bX.length] = (b0 >> 10);\n" +
                "                break;\n" +
                "            case 3:\n" +
                "                bX[bX.length] = (b0 >> 16);\n" +
                "                bX[bX.length] = (b0 >> 8) & 255;\n" +
                "                break\n" +
                "            }\n" +
                "            return bX\n" +
                "        };\n" +
                "        t.re = /-----BEGIN [^-]+-----([A-Za-z0-9+\\/=\\s]+)-----END [^-]+-----|begin-base64[^\\n]+\\n([A-Za-z0-9+\\/=\\s]+)====/;\n" +
                "        t.unarmor = function(bX) {\n" +
                "            var bW = t.re.exec(bX);\n" +
                "            if (bW) {\n" +
                "                if (bW[1]) {\n" +
                "                    bX = bW[1]\n" +
                "                } else {\n" +
                "                    if (bW[2]) {\n" +
                "                        bX = bW[2]\n" +
                "                    } else {\n" +
                "                        throw \"RegExp out of sync\"\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "            return t.decode(bX)\n" +
                "        };\n" +
                "        cyjcyj.Base64 = t\n" +
                "    })(); (function(bY) {\n" +
                "        var z = 100,\n" +
                "        t = \"\\u2026\",\n" +
                "        L = {\n" +
                "            tag: function(b0, b1) {\n" +
                "                var bZ = document.createElement(b0);\n" +
                "                bZ.className = b1;\n" +
                "                return bZ\n" +
                "            },\n" +
                "            text: function(bZ) {\n" +
                "                return document.createTextNode(bZ)\n" +
                "            }\n" +
                "        };\n" +
                "        function bX(bZ, b0) {\n" +
                "            if (bZ instanceof bX) {\n" +
                "                this.enc = bZ.enc;\n" +
                "                this.pos = bZ.pos\n" +
                "            } else {\n" +
                "                this.enc = bZ;\n" +
                "                this.pos = b0\n" +
                "            }\n" +
                "        }\n" +
                "        bX.prototype.get = function(bZ) {\n" +
                "            if (bZ === bY) {\n" +
                "                bZ = this.pos++\n" +
                "            }\n" +
                "            if (bZ >= this.enc.length) {\n" +
                "                throw \"Requesting byte offset \" + bZ + \" on a stream of length \" + this.enc.length\n" +
                "            }\n" +
                "            return this.enc[bZ]\n" +
                "        };\n" +
                "        bX.prototype.hexDigits = \"0123456789ABCDEF\";\n" +
                "        bX.prototype.hexByte = function(bZ) {\n" +
                "            return this.hexDigits.charAt((bZ >> 4) & 15) + this.hexDigits.charAt(bZ & 15)\n" +
                "        };\n" +
                "        bX.prototype.hexDump = function(b3, bZ, b0) {\n" +
                "            var b2 = \"\";\n" +
                "            for (var b1 = b3; b1 < bZ; ++b1) {\n" +
                "                b2 += this.hexByte(this.get(b1));\n" +
                "                if (b0 !== true) {\n" +
                "                    switch (b1 & 15) {\n" +
                "                    case 7:\n" +
                "                        b2 += \"  \";\n" +
                "                        break;\n" +
                "                    case 15:\n" +
                "                        b2 += \"\\n\";\n" +
                "                        break;\n" +
                "                    default:\n" +
                "                        b2 += \" \"\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "            return b2\n" +
                "        };\n" +
                "        bX.prototype.parseStringISO = function(b2, bZ) {\n" +
                "            var b1 = \"\";\n" +
                "            for (var b0 = b2; b0 < bZ; ++b0) {\n" +
                "                b1 += String.fromCharCode(this.get(b0))\n" +
                "            }\n" +
                "            return b1\n" +
                "        };\n" +
                "        bX.prototype.parseStringUTF = function(b3, bZ) {\n" +
                "            var b1 = \"\";\n" +
                "            for (var b0 = b3; b0 < bZ;) {\n" +
                "                var b2 = this.get(b0++);\n" +
                "                if (b2 < 128) {\n" +
                "                    b1 += String.fromCharCode(b2)\n" +
                "                } else {\n" +
                "                    if ((b2 > 191) && (b2 < 224)) {\n" +
                "                        b1 += String.fromCharCode(((b2 & 31) << 6) | (this.get(b0++) & 63))\n" +
                "                    } else {\n" +
                "                        b1 += String.fromCharCode(((b2 & 15) << 12) | ((this.get(b0++) & 63) << 6) | (this.get(b0++) & 63))\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "            return b1\n" +
                "        };\n" +
                "        bX.prototype.parseStringBMP = function(b4, b0) {\n" +
                "            var b3 = \"\";\n" +
                "            for (var b2 = b4; b2 < b0; b2 += 2) {\n" +
                "                var bZ = this.get(b2);\n" +
                "                var b1 = this.get(b2 + 1);\n" +
                "                b3 += String.fromCharCode((bZ << 8) + b1)\n" +
                "            }\n" +
                "            return b3\n" +
                "        };\n" +
                "        bX.prototype.reTime = /^((?:1[89]|2\\d)?\\d\\d)(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])([01]\\d|2[0-3])(?:([0-5]\\d)(?:([0-5]\\d)(?:[.,](\\d{1,3}))?)?)?(Z|[-+](?:[0]\\d|1[0-2])([0-5]\\d)?)?$/;\n" +
                "        bX.prototype.parseTime = function(b2, b0) {\n" +
                "            var b1 = this.parseStringISO(b2, b0),\n" +
                "            bZ = this.reTime.exec(b1);\n" +
                "            if (!bZ) {\n" +
                "                return \"Unrecognized time: \" + b1\n" +
                "            }\n" +
                "            b1 = bZ[1] + \"-\" + bZ[2] + \"-\" + bZ[3] + \" \" + bZ[4];\n" +
                "            if (bZ[5]) {\n" +
                "                b1 += \":\" + bZ[5];\n" +
                "                if (bZ[6]) {\n" +
                "                    b1 += \":\" + bZ[6];\n" +
                "                    if (bZ[7]) {\n" +
                "                        b1 += \".\" + bZ[7]\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "            if (bZ[8]) {\n" +
                "                b1 += \" UTC\";\n" +
                "                if (bZ[8] != \"Z\") {\n" +
                "                    b1 += bZ[8];\n" +
                "                    if (bZ[9]) {\n" +
                "                        b1 += \":\" + bZ[9]\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "            return b1\n" +
                "        };\n" +
                "        bX.prototype.parseInteger = function(b4, b0) {\n" +
                "            var bZ = b0 - b4;\n" +
                "            if (bZ > 4) {\n" +
                "                bZ <<= 3;\n" +
                "                var b2 = this.get(b4);\n" +
                "                if (b2 === 0) {\n" +
                "                    bZ -= 8\n" +
                "                } else {\n" +
                "                    while (b2 < 128) {\n" +
                "                        b2 <<= 1; --bZ\n" +
                "                    }\n" +
                "                }\n" +
                "                return \"(\" + bZ + \" bit)\"\n" +
                "            }\n" +
                "            var b3 = 0;\n" +
                "            for (var b1 = b4; b1 < b0; ++b1) {\n" +
                "                b3 = (b3 << 8) | this.get(b1)\n" +
                "            }\n" +
                "            return b3\n" +
                "        };\n" +
                "        bX.prototype.parseBitString = function(bZ, b0) {\n" +
                "            var b4 = this.get(bZ),\n" +
                "            b2 = ((b0 - bZ - 1) << 3) - b4,\n" +
                "            b7 = \"(\" + b2 + \" bit)\";\n" +
                "            if (b2 <= 20) {\n" +
                "                var b6 = b4;\n" +
                "                b7 += \" \";\n" +
                "                for (var b3 = b0 - 1; b3 > bZ; --b3) {\n" +
                "                    var b5 = this.get(b3);\n" +
                "                    for (var b1 = b6; b1 < 8; ++b1) {\n" +
                "                        b7 += (b5 >> b1) & 1 ? \"1\": \"0\"\n" +
                "                    }\n" +
                "                    b6 = 0\n" +
                "                }\n" +
                "            }\n" +
                "            return b7\n" +
                "        };\n" +
                "        bX.prototype.parseOctetString = function(b3, b0) {\n" +
                "            var bZ = b0 - b3,\n" +
                "            b2 = \"(\" + bZ + \" byte) \";\n" +
                "            if (bZ > z) {\n" +
                "                b0 = b3 + z\n" +
                "            }\n" +
                "            for (var b1 = b3; b1 < b0; ++b1) {\n" +
                "                b2 += this.hexByte(this.get(b1))\n" +
                "            }\n" +
                "            if (bZ > z) {\n" +
                "                b2 += t\n" +
                "            }\n" +
                "            return b2\n" +
                "        };\n" +
                "        bX.prototype.parseOID = function(b6, b0) {\n" +
                "            var b3 = \"\",\n" +
                "            b5 = 0,\n" +
                "            b4 = 0;\n" +
                "            for (var b2 = b6; b2 < b0; ++b2) {\n" +
                "                var b1 = this.get(b2);\n" +
                "                b5 = (b5 << 7) | (b1 & 127);\n" +
                "                b4 += 7;\n" +
                "                if (! (b1 & 128)) {\n" +
                "                    if (b3 === \"\") {\n" +
                "                        var bZ = b5 < 80 ? b5 < 40 ? 0 : 1 : 2;\n" +
                "                        b3 = bZ + \".\" + (b5 - bZ * 40)\n" +
                "                    } else {\n" +
                "                        b3 += \".\" + ((b4 >= 31) ? \"bigint\": b5)\n" +
                "                    }\n" +
                "                    b5 = b4 = 0\n" +
                "                }\n" +
                "            }\n" +
                "            return b3\n" +
                "        };\n" +
                "        function bW(b2, b3, b1, bZ, b0) {\n" +
                "            this.stream = b2;\n" +
                "            this.header = b3;\n" +
                "            this.length = b1;\n" +
                "            this.tag = bZ;\n" +
                "            this.sub = b0\n" +
                "        }\n" +
                "        bW.prototype.typeName = function() {\n" +
                "            if (this.tag === bY) {\n" +
                "                return \"unknown\"\n" +
                "            }\n" +
                "            var b1 = this.tag >> 6,\n" +
                "            bZ = (this.tag >> 5) & 1,\n" +
                "            b0 = this.tag & 31;\n" +
                "            switch (b1) {\n" +
                "            case 0:\n" +
                "                switch (b0) {\n" +
                "                case 0:\n" +
                "                    return \"EOC\";\n" +
                "                case 1:\n" +
                "                    return \"BOOLEAN\";\n" +
                "                case 2:\n" +
                "                    return \"INTEGER\";\n" +
                "                case 3:\n" +
                "                    return \"BIT_STRING\";\n" +
                "                case 4:\n" +
                "                    return \"OCTET_STRING\";\n" +
                "                case 5:\n" +
                "                    return \"NULL\";\n" +
                "                case 6:\n" +
                "                    return \"OBJECT_IDENTIFIER\";\n" +
                "                case 7:\n" +
                "                    return \"ObjectDescriptor\";\n" +
                "                case 8:\n" +
                "                    return \"EXTERNAL\";\n" +
                "                case 9:\n" +
                "                    return \"REAL\";\n" +
                "                case 10:\n" +
                "                    return \"ENUMERATED\";\n" +
                "                case 11:\n" +
                "                    return \"EMBEDDED_PDV\";\n" +
                "                case 12:\n" +
                "                    return \"UTF8String\";\n" +
                "                case 16:\n" +
                "                    return \"SEQUENCE\";\n" +
                "                case 17:\n" +
                "                    return \"SET\";\n" +
                "                case 18:\n" +
                "                    return \"NumericString\";\n" +
                "                case 19:\n" +
                "                    return \"PrintableString\";\n" +
                "                case 20:\n" +
                "                    return \"TeletexString\";\n" +
                "                case 21:\n" +
                "                    return \"VideotexString\";\n" +
                "                case 22:\n" +
                "                    return \"IA5String\";\n" +
                "                case 23:\n" +
                "                    return \"UTCTime\";\n" +
                "                case 24:\n" +
                "                    return \"GeneralizedTime\";\n" +
                "                case 25:\n" +
                "                    return \"GraphicString\";\n" +
                "                case 26:\n" +
                "                    return \"VisibleString\";\n" +
                "                case 27:\n" +
                "                    return \"GeneralString\";\n" +
                "                case 28:\n" +
                "                    return \"UniversalString\";\n" +
                "                case 30:\n" +
                "                    return \"BMPString\";\n" +
                "                default:\n" +
                "                    return \"Universal_\" + b0.toString(16)\n" +
                "                }\n" +
                "            case 1:\n" +
                "                return \"Application_\" + b0.toString(16);\n" +
                "            case 2:\n" +
                "                return \"[\" + b0 + \"]\";\n" +
                "            case 3:\n" +
                "                return \"Private_\" + b0.toString(16)\n" +
                "            }\n" +
                "        };\n" +
                "        bW.prototype.reSeemsASCII = /^[ -~]+$/;\n" +
                "        bW.prototype.content = function() {\n" +
                "            if (this.tag === bY) {\n" +
                "                return null\n" +
                "            }\n" +
                "            var b3 = this.tag >> 6,\n" +
                "            b0 = this.tag & 31,\n" +
                "            b2 = this.posContent(),\n" +
                "            bZ = Math.abs(this.length);\n" +
                "            if (b3 !== 0) {\n" +
                "                if (this.sub !== null) {\n" +
                "                    return \"(\" + this.sub.length + \" elem)\"\n" +
                "                }\n" +
                "                var b1 = this.stream.parseStringISO(b2, b2 + Math.min(bZ, z));\n" +
                "                if (this.reSeemsASCII.test(b1)) {\n" +
                "                    return b1.substring(0, 2 * z) + ((b1.length > 2 * z) ? t: \"\")\n" +
                "                } else {\n" +
                "                    return this.stream.parseOctetString(b2, b2 + bZ)\n" +
                "                }\n" +
                "            }\n" +
                "            switch (b0) {\n" +
                "            case 1:\n" +
                "                return (this.stream.get(b2) === 0) ? \"false\": \"true\";\n" +
                "            case 2:\n" +
                "                return this.stream.parseInteger(b2, b2 + bZ);\n" +
                "            case 3:\n" +
                "                return this.sub ? \"(\" + this.sub.length + \" elem)\": this.stream.parseBitString(b2, b2 + bZ);\n" +
                "            case 4:\n" +
                "                return this.sub ? \"(\" + this.sub.length + \" elem)\": this.stream.parseOctetString(b2, b2 + bZ);\n" +
                "            case 6:\n" +
                "                return this.stream.parseOID(b2, b2 + bZ);\n" +
                "            case 16:\n" +
                "            case 17:\n" +
                "                return \"(\" + this.sub.length + \" elem)\";\n" +
                "            case 12:\n" +
                "                return this.stream.parseStringUTF(b2, b2 + bZ);\n" +
                "            case 18:\n" +
                "            case 19:\n" +
                "            case 20:\n" +
                "            case 21:\n" +
                "            case 22:\n" +
                "            case 26:\n" +
                "                return this.stream.parseStringISO(b2, b2 + bZ);\n" +
                "            case 30:\n" +
                "                return this.stream.parseStringBMP(b2, b2 + bZ);\n" +
                "            case 23:\n" +
                "            case 24:\n" +
                "                return this.stream.parseTime(b2, b2 + bZ)\n" +
                "            }\n" +
                "            return null\n" +
                "        };\n" +
                "        bW.prototype.toString = function() {\n" +
                "            return this.typeName() + \"@\" + this.stream.pos + \"[header:\" + this.header + \",length:\" + this.length + \",sub:\" + ((this.sub === null) ? \"null\": this.sub.length) + \"]\"\n" +
                "        };\n" +
                "        bW.prototype.print = function(b0) {\n" +
                "            if (b0 === bY) {\n" +
                "                b0 = \"\"\n" +
                "            }\n" +
                "            document.writeln(b0 + this);\n" +
                "            if (this.sub !== null) {\n" +
                "                b0 += \"  \";\n" +
                "                for (var b1 = 0,\n" +
                "                bZ = this.sub.length; b1 < bZ; ++b1) {\n" +
                "                    this.sub[b1].print(b0)\n" +
                "                }\n" +
                "            }\n" +
                "        };\n" +
                "        bW.prototype.toPrettyString = function(b0) {\n" +
                "            if (b0 === bY) {\n" +
                "                b0 = \"\"\n" +
                "            }\n" +
                "            var b2 = b0 + this.typeName() + \" @\" + this.stream.pos;\n" +
                "            if (this.length >= 0) {\n" +
                "                b2 += \"+\"\n" +
                "            }\n" +
                "            b2 += this.length;\n" +
                "            if (this.tag & 32) {\n" +
                "                b2 += \" (constructed)\"\n" +
                "            } else {\n" +
                "                if (((this.tag == 3) || (this.tag == 4)) && (this.sub !== null)) {\n" +
                "                    b2 += \" (encapsulates)\"\n" +
                "                }\n" +
                "            }\n" +
                "            b2 += \"\\n\";\n" +
                "            if (this.sub !== null) {\n" +
                "                b0 += \"  \";\n" +
                "                for (var b1 = 0,\n" +
                "                bZ = this.sub.length; b1 < bZ; ++b1) {\n" +
                "                    b2 += this.sub[b1].toPrettyString(b0)\n" +
                "                }\n" +
                "            }\n" +
                "            return b2\n" +
                "        };\n" +
                "        bW.prototype.toDOM = function() {\n" +
                "            var b0 = L.tag(\"div\", \"node\");\n" +
                "            b0.asn1 = this;\n" +
                "            var b6 = L.tag(\"div\", \"head\");\n" +
                "            var b8 = this.typeName().replace(/_/g, \" \");\n" +
                "            b6.innerHTML = b8;\n" +
                "            var b4 = this.content();\n" +
                "            if (b4 !== null) {\n" +
                "                b4 = String(b4).replace(/</g, \"&lt;\");\n" +
                "                var b3 = L.tag(\"span\", \"preview\");\n" +
                "                b3.appendChild(L.text(b4));\n" +
                "                b6.appendChild(b3)\n" +
                "            }\n" +
                "            b0.appendChild(b6);\n" +
                "            this.node = b0;\n" +
                "            this.head = b6;\n" +
                "            var b7 = L.tag(\"div\", \"value\");\n" +
                "            b8 = \"Offset: \" + this.stream.pos + \"<br/>\";\n" +
                "            b8 += \"Length: \" + this.header + \"+\";\n" +
                "            if (this.length >= 0) {\n" +
                "                b8 += this.length\n" +
                "            } else {\n" +
                "                b8 += ( - this.length) + \" (undefined)\"\n" +
                "            }\n" +
                "            if (this.tag & 32) {\n" +
                "                b8 += \"<br/>(constructed)\"\n" +
                "            } else {\n" +
                "                if (((this.tag == 3) || (this.tag == 4)) && (this.sub !== null)) {\n" +
                "                    b8 += \"<br/>(encapsulates)\"\n" +
                "                }\n" +
                "            }\n" +
                "            if (b4 !== null) {\n" +
                "                b8 += \"<br/>Value:<br/><b>\" + b4 + \"</b>\";\n" +
                "                if ((typeof oids === \"object\") && (this.tag == 6)) {\n" +
                "                    var b1 = oids[b4];\n" +
                "                    if (b1) {\n" +
                "                        if (b1.d) {\n" +
                "                            b8 += \"<br/>\" + b1.d\n" +
                "                        }\n" +
                "                        if (b1.c) {\n" +
                "                            b8 += \"<br/>\" + b1.c\n" +
                "                        }\n" +
                "                        if (b1.w) {\n" +
                "                            b8 += \"<br/>(warning!)\"\n" +
                "                        }\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "            b7.innerHTML = b8;\n" +
                "            b0.appendChild(b7);\n" +
                "            var bZ = L.tag(\"div\", \"sub\");\n" +
                "            if (this.sub !== null) {\n" +
                "                for (var b2 = 0,\n" +
                "                b5 = this.sub.length; b2 < b5; ++b2) {\n" +
                "                    bZ.appendChild(this.sub[b2].toDOM())\n" +
                "                }\n" +
                "            }\n" +
                "            b0.appendChild(bZ);\n" +
                "            b6.onclick = function() {\n" +
                "                b0.className = (b0.className == \"node collapsed\") ? \"node\": \"node collapsed\"\n" +
                "            };\n" +
                "            return b0\n" +
                "        };\n" +
                "        bW.prototype.posStart = function() {\n" +
                "            return this.stream.pos\n" +
                "        };\n" +
                "        bW.prototype.posContent = function() {\n" +
                "            return this.stream.pos + this.header\n" +
                "        };\n" +
                "        bW.prototype.posEnd = function() {\n" +
                "            return this.stream.pos + this.header + Math.abs(this.length)\n" +
                "        };\n" +
                "        bW.prototype.fakeHover = function(bZ) {\n" +
                "            this.node.className += \" hover\";\n" +
                "            if (bZ) {\n" +
                "                this.head.className += \" hover\"\n" +
                "            }\n" +
                "        };\n" +
                "        bW.prototype.fakeOut = function(b0) {\n" +
                "            var bZ = / ?hover/;\n" +
                "            this.node.className = this.node.className.replace(bZ, \"\");\n" +
                "            if (b0) {\n" +
                "                this.head.className = this.head.className.replace(bZ, \"\")\n" +
                "            }\n" +
                "        };\n" +
                "        bW.prototype.toHexDOM_sub = function(b2, b1, b3, b4, bZ) {\n" +
                "            if (b4 >= bZ) {\n" +
                "                return\n" +
                "            }\n" +
                "            var b0 = L.tag(\"span\", b1);\n" +
                "            b0.appendChild(L.text(b3.hexDump(b4, bZ)));\n" +
                "            b2.appendChild(b0)\n" +
                "        };\n" +
                "        bW.prototype.toHexDOM = function(b0) {\n" +
                "            var b3 = L.tag(\"span\", \"hex\");\n" +
                "            if (b0 === bY) {\n" +
                "                b0 = b3\n" +
                "            }\n" +
                "            this.head.hexNode = b3;\n" +
                "            this.head.onmouseover = function() {\n" +
                "                this.hexNode.className = \"hexCurrent\"\n" +
                "            };\n" +
                "            this.head.onmouseout = function() {\n" +
                "                this.hexNode.className = \"hex\"\n" +
                "            };\n" +
                "            b3.asn1 = this;\n" +
                "            b3.onmouseover = function() {\n" +
                "                var b5 = !b0.selected;\n" +
                "                if (b5) {\n" +
                "                    b0.selected = this.asn1;\n" +
                "                    this.className = \"hexCurrent\"\n" +
                "                }\n" +
                "                this.asn1.fakeHover(b5)\n" +
                "            };\n" +
                "            b3.onmouseout = function() {\n" +
                "                var b5 = (b0.selected == this.asn1);\n" +
                "                this.asn1.fakeOut(b5);\n" +
                "                if (b5) {\n" +
                "                    b0.selected = null;\n" +
                "                    this.className = \"hex\"\n" +
                "                }\n" +
                "            };\n" +
                "            this.toHexDOM_sub(b3, \"tag\", this.stream, this.posStart(), this.posStart() + 1);\n" +
                "            this.toHexDOM_sub(b3, (this.length >= 0) ? \"dlen\": \"ulen\", this.stream, this.posStart() + 1, this.posContent());\n" +
                "            if (this.sub === null) {\n" +
                "                b3.appendChild(L.text(this.stream.hexDump(this.posContent(), this.posEnd())))\n" +
                "            } else {\n" +
                "                if (this.sub.length > 0) {\n" +
                "                    var b4 = this.sub[0];\n" +
                "                    var b2 = this.sub[this.sub.length - 1];\n" +
                "                    this.toHexDOM_sub(b3, \"intro\", this.stream, this.posContent(), b4.posStart());\n" +
                "                    for (var b1 = 0,\n" +
                "                    bZ = this.sub.length; b1 < bZ; ++b1) {\n" +
                "                        b3.appendChild(this.sub[b1].toHexDOM(b0))\n" +
                "                    }\n" +
                "                    this.toHexDOM_sub(b3, \"outro\", this.stream, b2.posEnd(), this.posEnd())\n" +
                "                }\n" +
                "            }\n" +
                "            return b3\n" +
                "        };\n" +
                "        bW.prototype.toHexString = function(bZ) {\n" +
                "            return this.stream.hexDump(this.posStart(), this.posEnd(), true)\n" +
                "        };\n" +
                "        bW.decodeLength = function(b2) {\n" +
                "            var b0 = b2.get(),\n" +
                "            bZ = b0 & 127;\n" +
                "            if (bZ == b0) {\n" +
                "                return bZ\n" +
                "            }\n" +
                "            if (bZ > 3) {\n" +
                "                throw \"Length over 24 bits not supported at position \" + (b2.pos - 1)\n" +
                "            }\n" +
                "            if (bZ === 0) {\n" +
                "                return - 1\n" +
                "            }\n" +
                "            b0 = 0;\n" +
                "            for (var b1 = 0; b1 < bZ; ++b1) {\n" +
                "                b0 = (b0 << 8) | b2.get()\n" +
                "            }\n" +
                "            return b0\n" +
                "        };\n" +
                "        bW.hasContent = function(b0, bZ, b5) {\n" +
                "            if (b0 & 32) {\n" +
                "                return true\n" +
                "            }\n" +
                "            if ((b0 < 3) || (b0 > 4)) {\n" +
                "                return false\n" +
                "            }\n" +
                "            var b4 = new bX(b5);\n" +
                "            if (b0 == 3) {\n" +
                "                b4.get()\n" +
                "            }\n" +
                "            var b3 = b4.get();\n" +
                "            if ((b3 >> 6) & 1) {\n" +
                "                return false\n" +
                "            }\n" +
                "            try {\n" +
                "                var b2 = bW.decodeLength(b4);\n" +
                "                return ((b4.pos - b5.pos) + b2 == bZ)\n" +
                "            } catch(b1) {\n" +
                "                return false\n" +
                "            }\n" +
                "        };\n" +
                "        bW.decode = function(b6) {\n" +
                "            if (! (b6 instanceof bX)) {\n" +
                "                b6 = new bX(b6, 0)\n" +
                "            }\n" +
                "            var b5 = new bX(b6),\n" +
                "            b8 = b6.get(),\n" +
                "            b3 = bW.decodeLength(b6),\n" +
                "            b2 = b6.pos - b5.pos,\n" +
                "            bZ = null;\n" +
                "            if (bW.hasContent(b8, b3, b6)) {\n" +
                "                var b0 = b6.pos;\n" +
                "                if (b8 == 3) {\n" +
                "                    b6.get()\n" +
                "                }\n" +
                "                bZ = [];\n" +
                "                if (b3 >= 0) {\n" +
                "                    var b1 = b0 + b3;\n" +
                "                    while (b6.pos < b1) {\n" +
                "                        bZ[bZ.length] = bW.decode(b6)\n" +
                "                    }\n" +
                "                    if (b6.pos != b1) {\n" +
                "                        throw \"Content size is not correct for container starting at offset \" + b0\n" +
                "                    }\n" +
                "                } else {\n" +
                "                    try {\n" +
                "                        for (;;) {\n" +
                "                            var b7 = bW.decode(b6);\n" +
                "                            if (b7.tag === 0) {\n" +
                "                                break\n" +
                "                            }\n" +
                "                            bZ[bZ.length] = b7\n" +
                "                        }\n" +
                "                        b3 = b0 - b6.pos\n" +
                "                    } catch(b4) {\n" +
                "                        throw \"Exception while decoding undefined length content: \" + b4\n" +
                "                    }\n" +
                "                }\n" +
                "            } else {\n" +
                "                b6.pos += b3\n" +
                "            }\n" +
                "            return new bW(b5, b2, b3, b8, bZ)\n" +
                "        };\n" +
                "        bW.test = function() {\n" +
                "            var b4 = [{\n" +
                "                value: [39],\n" +
                "                expected: 39\n" +
                "            },\n" +
                "            {\n" +
                "                value: [129, 201],\n" +
                "                expected: 201\n" +
                "            },\n" +
                "            {\n" +
                "                value: [131, 254, 220, 186],\n" +
                "                expected: 16702650\n" +
                "            }];\n" +
                "            for (var b1 = 0,\n" +
                "            bZ = b4.length; b1 < bZ; ++b1) {\n" +
                "                var b3 = 0,\n" +
                "                b2 = new bX(b4[b1].value, 0),\n" +
                "                b0 = bW.decodeLength(b2);\n" +
                "                if (b0 != b4[b1].expected) {\n" +
                "                    document.write(\"In test[\" + b1 + \"] expected \" + b4[b1].expected + \" got \" + b0 + \"\\n\")\n" +
                "                }\n" +
                "            }\n" +
                "        };\n" +
                "        cyjcyj.ASN1 = bW;   //修改为cyjcyj\n" +
                "    })();\n" +
                "    cyjcyj.ASN1.prototype.getHexStringValue = function() {  //修改为cyjcyj\n" +
                "        var t = this.toHexString();\n" +
                "        var L = this.header * 2;\n" +
                "        var z = this.length * 2;\n" +
                "        return t.substr(L, z)\n" +
                "    };\n" +
                "    A.prototype.parseKey = function(b1) {\n" +
                "        try {\n" +
                "            var b6 = 0;\n" +
                "            var bW = 0;\n" +
                "            var t = /^\\s*(?:[0-9A-Fa-f][0-9A-Fa-f]\\s*)+$/;\n" +
                "            var b5 = t.test(b1) ? Hex.decode(b1) : cyjcyj.Base64.unarmor(b1);     //修改为自定义对象的方法Base64.unarmor(b1);\n" +
                "            var bX = cyjcyj.ASN1.decode(b5); //修改为cyjcyj\n" +
                "            if (bX.sub.length === 3) {\n" +
                "                bX = bX.sub[2].sub[0]\n" +
                "            }\n" +
                "            if (bX.sub.length === 9) {\n" +
                "                b6 = bX.sub[1].getHexStringValue();\n" +
                "                this.n = w(b6, 16);\n" +
                "                bW = bX.sub[2].getHexStringValue();\n" +
                "                this.e = parseInt(bW, 16);\n" +
                "                var z = bX.sub[3].getHexStringValue();\n" +
                "                this.d = w(z, 16);\n" +
                "                var b0 = bX.sub[4].getHexStringValue();\n" +
                "                this.p = w(b0, 16);\n" +
                "                var bZ = bX.sub[5].getHexStringValue();\n" +
                "                this.q = w(bZ, 16);\n" +
                "                var b3 = bX.sub[6].getHexStringValue();\n" +
                "                this.dmp1 = w(b3, 16);\n" +
                "                var b2 = bX.sub[7].getHexStringValue();\n" +
                "                this.dmq1 = w(b2, 16);\n" +
                "                var L = bX.sub[8].getHexStringValue();\n" +
                "                this.coeff = w(L, 16)\n" +
                "            } else {\n" +
                "                if (bX.sub.length === 2) {\n" +
                "                    var b7 = bX.sub[1];\n" +
                "                    var bY = b7.sub[0];\n" +
                "                    b6 = bY.sub[0].getHexStringValue();\n" +
                "                    this.n = w(b6, 16);\n" +
                "                    bW = bY.sub[1].getHexStringValue();\n" +
                "                    this.e = parseInt(bW, 16)\n" +
                "                } else {\n" +
                "                    return false\n" +
                "                }\n" +
                "            }\n" +
                "            return true\n" +
                "        } catch(b4) {\n" +
                "            return false\n" +
                "        }\n" +
                "    };\n" +
                "    A.prototype.getPrivateBaseKey = function() {\n" +
                "        var z = {\n" +
                "            array: [new KJUR.asn1.DERInteger({\n" +
                "                \"int\": 0\n" +
                "            }), new KJUR.asn1.DERInteger({\n" +
                "                bigint: this.n\n" +
                "            }), new KJUR.asn1.DERInteger({\n" +
                "                \"int\": this.e\n" +
                "            }), new KJUR.asn1.DERInteger({\n" +
                "                bigint: this.d\n" +
                "            }), new KJUR.asn1.DERInteger({\n" +
                "                bigint: this.p\n" +
                "            }), new KJUR.asn1.DERInteger({\n" +
                "                bigint: this.q\n" +
                "            }), new KJUR.asn1.DERInteger({\n" +
                "                bigint: this.dmp1\n" +
                "            }), new KJUR.asn1.DERInteger({\n" +
                "                bigint: this.dmq1\n" +
                "            }), new KJUR.asn1.DERInteger({\n" +
                "                bigint: this.coeff\n" +
                "            })]\n" +
                "        };\n" +
                "        var t = new KJUR.asn1.DERSequence(z);\n" +
                "        return t.getEncodedHex()\n" +
                "    };\n" +
                "    A.prototype.getPrivateBaseKeyB64 = function() {\n" +
                "        return ae(this.getPrivateBaseKey())\n" +
                "    };\n" +
                "    A.prototype.getPublicBaseKey = function() {\n" +
                "        var L = {\n" +
                "            array: [new KJUR.asn1.DERObjectIdentifier({\n" +
                "                oid: \"1.2.840.113549.1.1.1\"\n" +
                "            }), new KJUR.asn1.DERNull()]\n" +
                "        };\n" +
                "        var t = new KJUR.asn1.DERSequence(L);\n" +
                "        L = {\n" +
                "            array: [new KJUR.asn1.DERInteger({\n" +
                "                bigint: this.n\n" +
                "            }), new KJUR.asn1.DERInteger({\n" +
                "                \"int\": this.e\n" +
                "            })]\n" +
                "        };\n" +
                "        var bX = new KJUR.asn1.DERSequence(L);\n" +
                "        L = {\n" +
                "            hex: \"00\" + bX.getEncodedHex()\n" +
                "        };\n" +
                "        var bW = new KJUR.asn1.DERBitString(L);\n" +
                "        L = {\n" +
                "            array: [t, bW]\n" +
                "        };\n" +
                "        var z = new KJUR.asn1.DERSequence(L);\n" +
                "        return z.getEncodedHex()\n" +
                "    };\n" +
                "    A.prototype.getPublicBaseKeyB64 = function() {\n" +
                "        return ae(this.getPublicBaseKey())\n" +
                "    };\n" +
                "    A.prototype.wordwrap = function(L, t) {\n" +
                "        t = t || 64;\n" +
                "        if (!L) {\n" +
                "            return L\n" +
                "        }\n" +
                "        var z = \"(.{1,\" + t + \"})( +|$\\n?)|(.{1,\" + t + \"})\";\n" +
                "        return L.match(RegExp(z, \"g\")).join(\"\\n\")\n" +
                "    };\n" +
                "    A.prototype.getPrivateKey = function() {\n" +
                "        var t = \"-----BEGIN RSA PRIVATE KEY-----\\n\";\n" +
                "        t += this.wordwrap(this.getPrivateBaseKeyB64()) + \"\\n\";\n" +
                "        t += \"-----END RSA PRIVATE KEY-----\";\n" +
                "        return t\n" +
                "    };\n" +
                "    A.prototype.getPublicKey = function() {\n" +
                "        var t = \"-----BEGIN PUBLIC KEY-----\\n\";\n" +
                "        t += this.wordwrap(this.getPublicBaseKeyB64()) + \"\\n\";\n" +
                "        t += \"-----END PUBLIC KEY-----\";\n" +
                "        return t\n" +
                "    };\n" +
                "    A.prototype.hasPublicKeyProperty = function(t) {\n" +
                "        t = t || {};\n" +
                "        return (t.hasOwnProperty(\"n\") && t.hasOwnProperty(\"e\"))\n" +
                "    };\n" +
                "    A.prototype.hasPrivateKeyProperty = function(t) {\n" +
                "        t = t || {};\n" +
                "        return (t.hasOwnProperty(\"n\") && t.hasOwnProperty(\"e\") && t.hasOwnProperty(\"d\") && t.hasOwnProperty(\"p\") && t.hasOwnProperty(\"q\") && t.hasOwnProperty(\"dmp1\") && t.hasOwnProperty(\"dmq1\") && t.hasOwnProperty(\"coeff\"))\n" +
                "    };\n" +
                "    A.prototype.parsePropertiesFrom = function(t) {\n" +
                "        this.n = t.n;\n" +
                "        this.e = t.e;\n" +
                "        if (t.hasOwnProperty(\"d\")) {\n" +
                "            this.d = t.d;\n" +
                "            this.p = t.p;\n" +
                "            this.q = t.q;\n" +
                "            this.dmp1 = t.dmp1;\n" +
                "            this.dmq1 = t.dmq1;\n" +
                "            this.coeff = t.coeff\n" +
                "        }\n" +
                "    };\n" +
                "    var bx = function(t) {\n" +
                "        A.call(this);\n" +
                "        if (t) {\n" +
                "            if (typeof t === \"string\") {\n" +
                "                this.parseKey(t)\n" +
                "            } else {\n" +
                "                if (this.hasPrivateKeyProperty(t) || this.hasPublicKeyProperty(t)) {\n" +
                "                    this.parsePropertiesFrom(t)\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    };\n" +
                "    bx.prototype = new A();\n" +
                "    bx.prototype.constructor = bx;\n" +
                "    var a3 = function(t) {\n" +
                "        t = t || {};\n" +
                "        this.default_key_size = parseInt(t.default_key_size) || 1024;\n" +
                "        this.default_public_exponent = t.default_public_exponent || \"010001\";\n" +
                "        this.log = t.log || false;\n" +
                "        this.key = null\n" +
                "    };\n" +
                "    a3.prototype.setKey = function(t) {\n" +
                "    \t//  t就是传入进来的公钥\n" +
                "        if (this.log && this.key) {\n" +
                "            console.warn(\"A key was already set, overriding existing.\")\n" +
                "        }\n" +
                "        this.key = new bx(t)\n" +
                "    };\n" +
                "    a3.prototype.setPrivateKey = function(t) {\n" +
                "        this.setKey(t)\n" +
                "    };\n" +
                "    a3.prototype.setPublicKey = function(t) {\n" +
                "        this.setKey(t)\n" +
                "    };\n" +
                "    a3.prototype.decrypt = function(t) {\n" +
                "        try {\n" +
                "            return this.getKey().decrypt(aW(t))\n" +
                "        } catch(z) {\n" +
                "            return false\n" +
                "        }\n" +
                "    };\n" +
                "    a3.prototype.encrypt = function(t) {\n" +
                "        try {\n" +
                "            return ae(this.getKey().encrypt(t))\n" +
                "        } catch(z) {\n" +
                "            return false\n" +
                "        }\n" +
                "    };\n" +
                "    a3.prototype.getKey = function(t) {\n" +
                "        if (!this.key) {\n" +
                "            this.key = new bx();\n" +
                "            if (t && {}.toString.call(t) === \"[object Function]\") {\n" +
                "                this.key.generateAsync(this.default_key_size, this.default_public_exponent, t);\n" +
                "                return\n" +
                "            }\n" +
                "            this.key.generate(this.default_key_size, this.default_public_exponent)\n" +
                "        }\n" +
                "        return this.key\n" +
                "    };\n" +
                "    a3.prototype.getPrivateKey = function() {\n" +
                "        return this.getKey().getPrivateKey()\n" +
                "    };\n" +
                "    a3.prototype.getPrivateKeyB64 = function() {\n" +
                "        return this.getKey().getPrivateBaseKeyB64()\n" +
                "    };\n" +
                "    a3.prototype.getPublicKey = function() {\n" +
                "        return this.getKey().getPublicKey()\n" +
                "    };\n" +
                "    a3.prototype.getPublicKeyB64 = function() {\n" +
                "        return this.getKey().getPublicBaseKeyB64()\n" +
                "    };\n" +
                "    a3.version = \"2.3.1\";\n" +
                "    ap.JSEncrypt = a3\n" +
                "});\n" +
                "\n" +
                "\n" +
                "\n" +
                "function login(){\n" +
                "\t var pubKey = \"MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDC7kw8r6tq43pwApYvkJ5laljaN9BZb21TAIfT/vexbobzH7Q8SUdP5uDPXEBKzOjx2L28y7Xs1d9v3tdPfKI2LR7PAzWBmDMn8riHrDDNpUpJnlAGUqJG9ooPn8j7YNpcxCa1iybOlc2kEhmJn5uwoanQq+CA6agNkqly2H4j6wIDAQAB\";\n" +
                "        var encrypt = new JSEncrypt();\n" +
                "        encrypt.setKey(pubKey);\n" +
                "\t\tvar pwd = encrypt.encrypt(\"123456\");\n" +
                "//\t\talert(pwd)\n" +
                "\treturn pwd;\n" +
                "}\n";
        v8.executeVoidScript(js);
        String xx = v8.executeStringFunction("login", null);
        System.out.println(xx);
    }
}
