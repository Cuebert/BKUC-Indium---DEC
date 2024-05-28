.class Lh8/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqa/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh8/t;->b(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic b:Lh8/t;


# direct methods
.method constructor <init>(Lh8/t;Landroid/widget/ImageView;)V
    .locals 0

    iput-object p1, p0, Lh8/t$a;->b:Lh8/t;

    iput-object p2, p0, Lh8/t$a;->a:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lh8/t$a;->b:Lh8/t;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lh8/t;->c(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public onSuccess()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh8/t$a;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lh8/t$a;->b:Lh8/t;

    invoke-virtual {v1, v0}, Lh8/t;->c(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lh8/t$a;->b:Lh8/t;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lh8/t;->c(Landroid/graphics/Bitmap;)V

    :goto_0
    return-void
.end method
