.class public Lna/e;
.super Lna/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lna/e$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lna/d;-><init>()V

    return-void
.end method

.method public static C()Lna/e;
    .locals 1

    invoke-static {}, Lna/e$a;->a()Lna/e;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public g(Lna/f;)Ljava/lang/String;
    .locals 0

    const-string p1, ""

    return-object p1
.end method
