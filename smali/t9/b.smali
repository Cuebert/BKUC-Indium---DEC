.class public Lt9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/platform/NoObfuscate;


# instance fields
.field public category:Ljava/lang/String;

.field public latestNotificationId:Ljava/lang/String;

.field public notificationType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lt9/b;->notificationType:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lt9/b;->category:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lt9/b;->latestNotificationId:Ljava/lang/String;

    return-void
.end method
