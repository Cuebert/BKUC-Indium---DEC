.class public Lz9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lr2/a;->a(Landroid/content/Context;)Lr2/b;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Lr2/b;->y()Lg4/l;

    move-result-object p1

    .line 3
    new-instance v0, Lz9/d$a;

    invoke-direct {v0, p0, p2}, Lz9/d$a;-><init>(Lz9/d;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lg4/l;->f(Lg4/h;)Lg4/l;

    .line 4
    new-instance v0, Lz9/d$b;

    invoke-direct {v0, p0, p2}, Lz9/d$b;-><init>(Lz9/d;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lg4/l;->d(Lg4/g;)Lg4/l;

    return-void
.end method
