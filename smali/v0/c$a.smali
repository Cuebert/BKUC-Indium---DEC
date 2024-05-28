.class public final Lv0/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/e;)V
    .locals 0

    invoke-direct {p0}, Lv0/c$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lv0/c$a;Lu0/e;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lv0/c$a;->b(Lu0/e;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lu0/e;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lu0/e;",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Lv0/a;

    if-eqz v0, :cond_0

    .line 2
    new-instance p3, Lv0/a;

    invoke-direct {p3, p1, p2}, Lv0/a;-><init>(Lu0/e;Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 3
    :cond_0
    instance-of p3, p3, Lv0/d;

    if-eqz p3, :cond_1

    .line 4
    new-instance p3, Lv0/d;

    invoke-direct {p3, p1, p2}, Lv0/d;-><init>(Lu0/e;Ljava/lang/CharSequence;)V

    :goto_0
    return-object p3

    .line 5
    :cond_1
    new-instance p1, Lw0/a;

    invoke-direct {p1}, Lw0/a;-><init>()V

    throw p1
.end method
