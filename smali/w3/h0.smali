.class public final Lw3/h0;
.super Lw3/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lw3/i0<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    new-instance v0, Lw3/r0;

    const/16 v1, 0xc

    .line 1
    invoke-direct {v0, v1}, Lw3/r0;-><init>(I)V

    .line 2
    invoke-direct {p0, v0}, Lw3/i0;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method public static r()Lw3/h0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lw3/h0<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lw3/h0;

    invoke-direct {v0}, Lw3/h0;-><init>()V

    return-object v0
.end method


# virtual methods
.method final bridge synthetic e()Ljava/util/Collection;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0
.end method
