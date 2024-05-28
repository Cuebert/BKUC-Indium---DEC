.class Lcom/roblox/client/i0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls7/h$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/i0;->z1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/client/i0;


# direct methods
.method constructor <init>(Lcom/roblox/client/i0;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/i0$a;->a:Lcom/roblox/client/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    const-string v0, "rbx.locale"

    if-eqz p1, :cond_0

    const-string p1, "(OnAppResume) Recreating activity due to Locale change."

    .line 1
    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Lcom/roblox/client/i0$a;->a:Lcom/roblox/client/i0;

    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    goto :goto_0

    :cond_0
    const-string p1, "Retrieved locale same as current locale"

    .line 3
    invoke-static {v0, p1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method
