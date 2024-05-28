.class public final Ly3/r7;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ly3/f7;IIJIIII)V
    .locals 0

    .line 1
    invoke-static/range {p1 .. p8}, Ly3/r7;->b(IIJIIII)Ly3/q7;

    move-result-object p1

    .line 2
    sget-object p2, Ly3/y4;->G1:Ly3/y4;

    invoke-virtual {p0, p1, p2}, Ly3/f7;->b(Ly3/q7;Ly3/y4;)V

    return-void
.end method

.method private static b(IIJIIII)Ly3/q7;
    .locals 12

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    new-instance v11, Ly3/q7;

    sub-long v8, v0, p2

    move-object v2, v11

    move v3, p0

    move v4, p1

    move/from16 v5, p6

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v10, p7

    .line 2
    invoke-direct/range {v2 .. v10}, Ly3/q7;-><init>(IIIIIJI)V

    return-object v11
.end method
