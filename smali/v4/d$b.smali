.class Lv4/d$b;
.super Lv4/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv4/d;->g(Landroid/content/Context;Landroid/text/TextPaint;Lv4/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/text/TextPaint;

.field final synthetic b:Lv4/f;

.field final synthetic c:Lv4/d;


# direct methods
.method constructor <init>(Lv4/d;Landroid/text/TextPaint;Lv4/f;)V
    .locals 0

    iput-object p1, p0, Lv4/d$b;->c:Lv4/d;

    iput-object p2, p0, Lv4/d$b;->a:Landroid/text/TextPaint;

    iput-object p3, p0, Lv4/d$b;->b:Lv4/f;

    invoke-direct {p0}, Lv4/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lv4/d$b;->b:Lv4/f;

    invoke-virtual {v0, p1}, Lv4/f;->a(I)V

    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv4/d$b;->c:Lv4/d;

    iget-object v1, p0, Lv4/d$b;->a:Landroid/text/TextPaint;

    invoke-virtual {v0, v1, p1}, Lv4/d;->l(Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    .line 2
    iget-object v0, p0, Lv4/d$b;->b:Lv4/f;

    invoke-virtual {v0, p1, p2}, Lv4/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
