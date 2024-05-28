.class Lk8/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqa/c0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk8/c;->c(Landroid/content/Context;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lk8/c;


# direct methods
.method constructor <init>(Lk8/c;)V
    .locals 0

    iput-object p1, p0, Lk8/c$a;->a:Lk8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to get thumbnail bitmap. error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc9/k;->b(Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Lk8/c$a;->a:Lk8/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lk8/c;->d(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public b(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public c(Landroid/graphics/Bitmap;Lqa/t$e;)V
    .locals 0

    iget-object p2, p0, Lk8/c$a;->a:Lk8/c;

    invoke-virtual {p2, p1}, Lk8/c;->d(Landroid/graphics/Bitmap;)V

    return-void
.end method
