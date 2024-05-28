.class Ly7/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/SearchView$OnQueryTextListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly7/f;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/widget/SearchView;

.field final synthetic b:Ly7/f;


# direct methods
.method constructor <init>(Ly7/f;Landroidx/appcompat/widget/SearchView;)V
    .locals 0

    iput-object p1, p0, Ly7/f$b;->b:Ly7/f;

    iput-object p2, p0, Ly7/f$b;->a:Landroidx/appcompat/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Ly7/f$b;->b:Ly7/f;

    invoke-static {v0}, Ly7/f;->f(Ly7/f;)Ly7/f$e;

    move-result-object v0

    invoke-interface {v0, p1}, Ly7/f$e;->onQueryTextChange(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Ly7/f$b;->b:Ly7/f;

    invoke-static {v0}, Ly7/f;->f(Ly7/f;)Ly7/f$e;

    move-result-object v0

    iget-object v1, p0, Ly7/f$b;->a:Landroidx/appcompat/widget/SearchView;

    invoke-interface {v0, v1, p1}, Ly7/f$e;->d(Landroidx/appcompat/widget/SearchView;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
