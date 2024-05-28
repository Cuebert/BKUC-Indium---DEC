.class Lk8/d$b;
.super Lk8/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk8/d;->a(Landroid/content/Context;Ll8/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic f:Landroidx/core/app/k$e;

.field final synthetic g:Landroid/content/Context;

.field final synthetic h:Ll8/c;

.field final synthetic i:Lk8/d;


# direct methods
.method constructor <init>(Lk8/d;Landroid/content/Context;JLl8/b;Ljava/lang/String;Landroidx/core/app/k$e;Landroid/content/Context;Ll8/c;)V
    .locals 6

    iput-object p1, p0, Lk8/d$b;->i:Lk8/d;

    iput-object p7, p0, Lk8/d$b;->f:Landroidx/core/app/k$e;

    iput-object p8, p0, Lk8/d$b;->g:Landroid/content/Context;

    iput-object p9, p0, Lk8/d$b;->h:Ll8/c;

    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lk8/c;-><init>(Landroid/content/Context;JLl8/b;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public d(Landroid/graphics/Bitmap;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lk8/d$b;->f:Landroidx/core/app/k$e;

    invoke-virtual {v0, p1}, Landroidx/core/app/k$e;->t(Landroid/graphics/Bitmap;)Landroidx/core/app/k$e;

    .line 2
    :cond_0
    iget-object p1, p0, Lk8/d$b;->f:Landroidx/core/app/k$e;

    invoke-virtual {p1}, Landroidx/core/app/k$e;->c()Landroid/app/Notification;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lk8/d$b;->g:Landroid/content/Context;

    invoke-static {v0}, Landroidx/core/app/n;->b(Landroid/content/Context;)Landroidx/core/app/n;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lk8/d$b;->h:Ll8/c;

    invoke-interface {v1}, Ll8/c;->h()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lk8/d$b;->h:Ll8/c;

    invoke-interface {v2}, Ll8/c;->i()I

    move-result v2

    invoke-virtual {v0, v1, v2, p1}, Landroidx/core/app/n;->e(Ljava/lang/String;ILandroid/app/Notification;)V

    return-void
.end method
