.class Lv4/d$a;
.super Landroidx/core/content/res/h$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv4/d;->h(Landroid/content/Context;Lv4/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv4/f;

.field final synthetic b:Lv4/d;


# direct methods
.method constructor <init>(Lv4/d;Lv4/f;)V
    .locals 0

    iput-object p1, p0, Lv4/d$a;->b:Lv4/d;

    iput-object p2, p0, Lv4/d$a;->a:Lv4/f;

    invoke-direct {p0}, Landroidx/core/content/res/h$e;-><init>()V

    return-void
.end method


# virtual methods
.method public h(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv4/d$a;->b:Lv4/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lv4/d;->c(Lv4/d;Z)Z

    .line 2
    iget-object v0, p0, Lv4/d$a;->a:Lv4/f;

    invoke-virtual {v0, p1}, Lv4/f;->a(I)V

    return-void
.end method

.method public i(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv4/d$a;->b:Lv4/d;

    iget v1, v0, Lv4/d;->f:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-static {v0, p1}, Lv4/d;->b(Lv4/d;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 2
    iget-object p1, p0, Lv4/d$a;->b:Lv4/d;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lv4/d;->c(Lv4/d;Z)Z

    .line 3
    iget-object p1, p0, Lv4/d$a;->a:Lv4/f;

    iget-object v0, p0, Lv4/d$a;->b:Lv4/d;

    invoke-static {v0}, Lv4/d;->a(Lv4/d;)Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lv4/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
