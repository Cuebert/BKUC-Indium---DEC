.class public Lha/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lha/a$e;
    }
.end annotation


# static fields
.field private static g:Lha/a;

.field private static h:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field private b:Lcom/roblox/universalapp/messagebus/Connection;

.field private c:Lcom/roblox/universalapp/messagebus/Connection;

.field private d:Lcom/roblox/universalapp/messagebus/Connection;

.field private e:Lcom/roblox/universalapp/messagebus/Connection;

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lha/a;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lha/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    .line 3
    iput-object v0, p0, Lha/a;->c:Lcom/roblox/universalapp/messagebus/Connection;

    .line 4
    iput-object v0, p0, Lha/a;->d:Lcom/roblox/universalapp/messagebus/Connection;

    .line 5
    iput-object v0, p0, Lha/a;->e:Lcom/roblox/universalapp/messagebus/Connection;

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lha/a;->f:Z

    if-eqz p1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->e()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lha/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    return-void
.end method

.method public static a(I)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/high16 v0, 0x2000000

    or-int/2addr p0, v0

    :cond_0
    return p0
.end method

.method static b(Landroidx/appcompat/app/c;Landroid/content/Intent;Landroid/content/Intent;I)V
    .locals 3

    const/high16 v0, 0x8000000

    .line 1
    invoke-static {v0}, Lha/a;->a(I)I

    move-result v0

    const/4 v1, 0x0

    .line 2
    invoke-static {p0, v1, p2, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p2

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x16

    if-lt v0, v2, :cond_0

    .line 4
    invoke-virtual {p2}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p2

    invoke-static {p1, v1, p2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;Landroid/content/IntentSender;)Landroid/content/Intent;

    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p3}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    .line 7
    invoke-virtual {p0, p1, p3}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :goto_0
    return-void
.end method

.method static c(Landroidx/appcompat/app/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILha/a$e;)V
    .locals 1

    if-eqz p7, :cond_0

    .line 1
    invoke-interface {p7, p4, p3}, Lha/a$e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getFilesDir()Ljava/io/File;

    move-result-object p4

    const/4 p7, 0x0

    if-eqz p4, :cond_1

    .line 3
    invoke-virtual {p4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p4

    goto :goto_0

    :cond_1
    move-object p4, p7

    :goto_0
    if-eqz p4, :cond_2

    .line 4
    invoke-virtual {p4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p7

    :cond_2
    if-eqz p7, :cond_3

    .line 5
    invoke-virtual {p7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p4

    goto :goto_1

    :cond_3
    const-string p4, ""

    :goto_1
    const-string p7, "/"

    .line 6
    invoke-virtual {p4, p7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    :cond_4
    const-string p7, "content://"

    .line 8
    invoke-virtual {p1, p4, p7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 9
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 10
    new-instance p4, Landroid/content/Intent;

    const-string p7, "android.intent.action.SEND"

    invoke-direct {p4, p7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 11
    invoke-virtual {p4, p1, p2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "android.intent.extra.STREAM"

    .line 12
    invoke-virtual {p4, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 p1, 0x1

    .line 13
    invoke-virtual {p4, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 14
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "android.intent.extra.TEXT"

    .line 15
    invoke-virtual {p4, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 16
    :cond_5
    invoke-static {p0, p4, p5, p6}, Lha/a;->b(Landroidx/appcompat/app/c;Landroid/content/Intent;Landroid/content/Intent;I)V

    return-void
.end method

.method static d(Landroidx/appcompat/app/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILha/a$e;)V
    .locals 8

    const-string v2, "image/*"

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-static/range {v0 .. v7}, Lha/a;->c(Landroidx/appcompat/app/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILha/a$e;)V

    return-void
.end method

.method static e(Landroidx/appcompat/app/c;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILha/a$e;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p5, :cond_1

    const-string v0, ""

    .line 2
    invoke-interface {p5, p2, v0}, Lha/a$e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    :cond_1
    new-instance p2, Landroid/content/Intent;

    const-string p5, "android.intent.action.SEND"

    invoke-direct {p2, p5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p5, "text/plain"

    .line 4
    invoke-virtual {p2, p5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string p5, "android.intent.extra.TEXT"

    .line 5
    invoke-virtual {p2, p5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    invoke-static {p0, p2, p3, p4}, Lha/a;->b(Landroidx/appcompat/app/c;Landroid/content/Intent;Landroid/content/Intent;I)V

    return-void
.end method

.method static f(Landroidx/appcompat/app/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILha/a$e;)V
    .locals 8

    const-string v2, "video/*"

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-static/range {v0 .. v7}, Lha/a;->c(Landroidx/appcompat/app/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILha/a$e;)V

    return-void
.end method

.method public static g()Lha/a;
    .locals 2

    .line 1
    sget-object v0, Lha/a;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lha/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lha/a;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    sput-object v0, Lha/a;->g:Lha/a;

    .line 3
    :cond_0
    sget-object v0, Lha/a;->g:Lha/a;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized h(Landroidx/appcompat/app/c;Landroid/content/Intent;ILha/a$e;)V
    .locals 9

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lha/a;->f:Z

    if-eqz v0, :cond_0

    const-string p1, "ContentSharingProtocol"

    const-string p2, "Attempted to set ExternalContentSharingProtocol callback, but one is already set."

    .line 2
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 4
    :try_start_1
    iput-boolean v0, p0, Lha/a;->f:Z

    .line 5
    iget-object v0, p0, Lha/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/externalcontentsharing/JNIExternalContentSharingProtocol;->getShareTextId()Ljava/lang/String;

    move-result-object v1

    new-instance v8, Lha/a$a;

    move-object v2, v8

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lha/a$a;-><init>(Lha/a;Landroidx/appcompat/app/c;Landroid/content/Intent;ILha/a$e;)V

    invoke-virtual {v0, v1, v8}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lha/a;->c:Lcom/roblox/universalapp/messagebus/Connection;

    .line 6
    iget-object v0, p0, Lha/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/externalcontentsharing/JNIExternalContentSharingProtocol;->getShareUrlId()Ljava/lang/String;

    move-result-object v1

    new-instance v8, Lha/a$b;

    move-object v2, v8

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lha/a$b;-><init>(Lha/a;Landroidx/appcompat/app/c;Landroid/content/Intent;ILha/a$e;)V

    invoke-virtual {v0, v1, v8}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lha/a;->d:Lcom/roblox/universalapp/messagebus/Connection;

    .line 7
    iget-object v0, p0, Lha/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/externalcontentsharing/JNIExternalContentSharingProtocol;->getShareImageId()Ljava/lang/String;

    move-result-object v1

    new-instance v8, Lha/a$c;

    move-object v2, v8

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lha/a$c;-><init>(Lha/a;Landroidx/appcompat/app/c;Landroid/content/Intent;ILha/a$e;)V

    invoke-virtual {v0, v1, v8}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iput-object v0, p0, Lha/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    .line 8
    iget-object v0, p0, Lha/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lcom/roblox/universalapp/externalcontentsharing/JNIExternalContentSharingProtocol;->getShareVideoId()Ljava/lang/String;

    move-result-object v1

    new-instance v8, Lha/a$d;

    move-object v2, v8

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lha/a$d;-><init>(Lha/a;Landroidx/appcompat/app/c;Landroid/content/Intent;ILha/a$e;)V

    invoke-virtual {v0, v1, v8}, Lcom/roblox/universalapp/messagebus/MessageBus;->m(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Lha/a;->e:Lcom/roblox/universalapp/messagebus/Connection;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized i()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lha/a;->f:Z

    if-nez v0, :cond_0

    const-string v0, "ContentSharingProtocol"

    const-string v1, "Attempted to disconnect ExternalContentSharingProtocol callback, but one is not connected."

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    .line 4
    :cond_0
    :try_start_1
    iget-object v0, p0, Lha/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-virtual {v0}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lha/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    .line 6
    iget-object v1, p0, Lha/a;->c:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-virtual {v1}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    .line 7
    iput-object v0, p0, Lha/a;->c:Lcom/roblox/universalapp/messagebus/Connection;

    .line 8
    iget-object v1, p0, Lha/a;->d:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-virtual {v1}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    .line 9
    iput-object v0, p0, Lha/a;->d:Lcom/roblox/universalapp/messagebus/Connection;

    .line 10
    iget-object v1, p0, Lha/a;->e:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-virtual {v1}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    .line 11
    iput-object v0, p0, Lha/a;->e:Lcom/roblox/universalapp/messagebus/Connection;

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lha/a;->f:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
