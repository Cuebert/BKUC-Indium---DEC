.class Ly7/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/q$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly7/c;->c(Landroidx/lifecycle/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/d;

.field final synthetic b:Ly7/c;


# direct methods
.method constructor <init>(Ly7/c;Landroidx/fragment/app/d;)V
    .locals 0

    iput-object p1, p0, Ly7/c$a;->b:Ly7/c;

    iput-object p2, p0, Ly7/c$a;->a:Landroidx/fragment/app/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ly7/c$a;->b:Ly7/c;

    iget-object v1, p0, Ly7/c$a;->a:Landroidx/fragment/app/d;

    invoke-static {v0, v1}, Ly7/c;->a(Ly7/c;Landroid/app/Activity;)V

    return-void
.end method
