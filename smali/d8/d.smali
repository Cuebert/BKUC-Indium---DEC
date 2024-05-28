.class public Ld8/d;
.super Ld8/a;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld8/a;-><init>()V

    .line 2
    iput-object p1, p0, Ld8/d;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 1

    .line 1
    iget-object p1, p0, Ld8/d;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/roblox/client/k;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance v0, Ld8/d$a;

    invoke-direct {v0, p0, p1}, Ld8/d$a;-><init>(Ld8/d;Ljava/lang/String;)V

    return-object v0
.end method

.method public c(Ld8/f$a;)Lu6/a;
    .locals 1

    .line 1
    sget-object v0, Ld8/f$a;->n:Ld8/f$a;

    if-ne p1, v0, :cond_0

    .line 2
    sget-object p1, Lu6/a;->t:Lu6/a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
