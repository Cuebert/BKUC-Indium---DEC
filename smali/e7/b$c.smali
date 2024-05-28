.class Le7/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls7/h$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le7/b;->onAppLocaleChangeEvent(La7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Le7/b;


# direct methods
.method constructor <init>(Le7/b;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Le7/b$c;->b:Le7/b;

    iput-object p2, p0, Le7/b$c;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    const-string v0, "rbx.locale"

    const-string v1, "onAppLanguageChangeEvent(), Api call to get locale values"

    .line 1
    invoke-static {v0, v1}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Le7/b$c;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Le7/b$c;->b:Le7/b;

    invoke-static {v0}, Le7/b;->k3(Le7/b;)V

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Le7/b$c;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    .line 5
    iget-object p1, p0, Le7/b$c;->a:Landroid/app/Activity;

    instance-of v0, p1, Lcom/roblox/client/ActivityNativeMain;

    if-nez v0, :cond_1

    .line 6
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method
