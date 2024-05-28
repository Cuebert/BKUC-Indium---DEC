.class Ly7/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly7/f$a;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ly7/f$a;


# direct methods
.method constructor <init>(Ly7/f$a;)V
    .locals 0

    iput-object p1, p0, Ly7/f$a$a;->n:Ly7/f$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ly7/f$a$a;->n:Ly7/f$a;

    iget-object v0, v0, Ly7/f$a;->b:Ly7/f;

    invoke-static {v0}, Ly7/f;->a(Ly7/f;)Lcom/roblox/client/components/RobloxToolbar;

    move-result-object v0

    iget-object v1, p0, Ly7/f$a$a;->n:Ly7/f$a;

    iget-object v1, v1, Ly7/f$a;->b:Ly7/f;

    invoke-static {v1}, Ly7/f;->b(Ly7/f;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roblox/client/components/m;->d(Landroidx/appcompat/widget/Toolbar;I)V

    return-void
.end method
