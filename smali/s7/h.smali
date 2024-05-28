.class public Ls7/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls7/h$d;,
        Ls7/h$c;
    }
.end annotation


# instance fields
.field a:Lu7/a;

.field b:Ls7/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lu7/a;

    invoke-direct {v0}, Lu7/a;-><init>()V

    iput-object v0, p0, Ls7/h;->a:Lu7/a;

    .line 3
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v0

    iput-object v0, p0, Ls7/h;->b:Ls7/b;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ls7/h$c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Ls7/h;->b(Landroid/content/Context;ZLs7/h$c;)V

    return-void
.end method

.method public b(Landroid/content/Context;ZLs7/h$c;)V
    .locals 3

    iget-object v0, p0, Ls7/h;->a:Lu7/a;

    iget-object v1, p0, Ls7/h;->b:Ls7/b;

    invoke-virtual {v1}, Ls7/b;->e()Ljava/util/Locale;

    move-result-object v1

    new-instance v2, Ls7/h$a;

    invoke-direct {v2, p0, p2, p1, p3}, Ls7/h$a;-><init>(Ls7/h;ZLandroid/content/Context;Ls7/h$c;)V

    invoke-virtual {v0, v1, v2}, Lu7/a;->d(Ljava/util/Locale;Ls7/g;)V

    return-void
.end method

.method public c(Landroid/content/Context;Ls7/h$d;)V
    .locals 3

    iget-object v0, p0, Ls7/h;->a:Lu7/a;

    iget-object v1, p0, Ls7/h;->b:Ls7/b;

    invoke-virtual {v1}, Ls7/b;->e()Ljava/util/Locale;

    move-result-object v1

    new-instance v2, Ls7/h$b;

    invoke-direct {v2, p0, p1, p2}, Ls7/h$b;-><init>(Ls7/h;Landroid/content/Context;Ls7/h$d;)V

    invoke-virtual {v0, v1, v2}, Lu7/a;->d(Ljava/util/Locale;Ls7/g;)V

    return-void
.end method
