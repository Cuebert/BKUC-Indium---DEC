.class Lh8/a$a;
.super Lh8/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh8/a;->e(Landroid/content/Context;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Landroid/content/Context;

.field final synthetic e:Z

.field final synthetic f:Lh8/a;


# direct methods
.method constructor <init>(Lh8/a;Landroid/content/Context;JLandroid/content/Context;Z)V
    .locals 0

    iput-object p1, p0, Lh8/a$a;->f:Lh8/a;

    iput-object p5, p0, Lh8/a$a;->d:Landroid/content/Context;

    iput-boolean p6, p0, Lh8/a$a;->e:Z

    invoke-direct {p0, p2, p3, p4}, Lh8/t;-><init>(Landroid/content/Context;J)V

    return-void
.end method


# virtual methods
.method public c(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lh8/a$a;->f:Lh8/a;

    iget-object v0, v0, Lh8/a;->a:Lj8/e;

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lh8/a$a;->f:Lh8/a;

    iget-object v1, p0, Lh8/a$a;->d:Landroid/content/Context;

    iget-boolean v2, p0, Lh8/a$a;->e:Z

    invoke-virtual {v0, v1, v2, p1}, Lh8/a;->g(Landroid/content/Context;ZLandroid/graphics/Bitmap;)Landroidx/core/app/k$e;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lh8/a$a;->f:Lh8/a;

    iget-object v1, p0, Lh8/a$a;->d:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lh8/a;->u(Landroid/content/Context;Landroidx/core/app/k$e;)V

    :goto_0
    return-void
.end method
