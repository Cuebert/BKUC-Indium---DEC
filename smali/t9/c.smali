.class public Lt9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/platform/NoObfuscate;


# instance fields
.field public authorizeForUser:Z

.field public notificationToken:Ljava/lang/String;

.field public oldNotificationToken:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lt9/c;->notificationToken:Ljava/lang/String;

    .line 3
    iput-boolean p2, p0, Lt9/c;->authorizeForUser:Z

    .line 4
    iput-object p3, p0, Lt9/c;->oldNotificationToken:Ljava/lang/String;

    return-void
.end method
