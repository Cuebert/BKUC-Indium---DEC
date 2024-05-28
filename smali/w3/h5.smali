.class final Lw3/h5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ll5/d<",
        "Lw3/g8;",
        ">;"
    }
.end annotation


# static fields
.field private static final A:Ll5/c;

.field private static final B:Ll5/c;

.field private static final C:Ll5/c;

.field private static final D:Ll5/c;

.field private static final E:Ll5/c;

.field private static final F:Ll5/c;

.field private static final G:Ll5/c;

.field private static final H:Ll5/c;

.field private static final I:Ll5/c;

.field private static final J:Ll5/c;

.field private static final K:Ll5/c;

.field private static final L:Ll5/c;

.field private static final M:Ll5/c;

.field private static final N:Ll5/c;

.field private static final O:Ll5/c;

.field private static final P:Ll5/c;

.field private static final Q:Ll5/c;

.field private static final R:Ll5/c;

.field private static final S:Ll5/c;

.field private static final T:Ll5/c;

.field private static final U:Ll5/c;

.field private static final V:Ll5/c;

.field private static final W:Ll5/c;

.field private static final X:Ll5/c;

.field private static final Y:Ll5/c;

.field private static final Z:Ll5/c;

.field static final a:Lw3/h5;

.field private static final a0:Ll5/c;

.field private static final b:Ll5/c;

.field private static final b0:Ll5/c;

.field private static final c:Ll5/c;

.field private static final c0:Ll5/c;

.field private static final d:Ll5/c;

.field private static final d0:Ll5/c;

.field private static final e:Ll5/c;

.field private static final e0:Ll5/c;

.field private static final f:Ll5/c;

.field private static final f0:Ll5/c;

.field private static final g:Ll5/c;

.field private static final h:Ll5/c;

.field private static final i:Ll5/c;

.field private static final j:Ll5/c;

.field private static final k:Ll5/c;

.field private static final l:Ll5/c;

.field private static final m:Ll5/c;

.field private static final n:Ll5/c;

.field private static final o:Ll5/c;

.field private static final p:Ll5/c;

.field private static final q:Ll5/c;

.field private static final r:Ll5/c;

.field private static final s:Ll5/c;

.field private static final t:Ll5/c;

.field private static final u:Ll5/c;

.field private static final v:Ll5/c;

.field private static final w:Ll5/c;

.field private static final x:Ll5/c;

.field private static final y:Ll5/c;

.field private static final z:Ll5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw3/h5;

    invoke-direct {v0}, Lw3/h5;-><init>()V

    sput-object v0, Lw3/h5;->a:Lw3/h5;

    const-string v0, "systemInfo"

    .line 1
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 2
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->b:Ll5/c;

    const-string v0, "eventName"

    .line 6
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 7
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->c:Ll5/c;

    const-string v0, "isThickClient"

    .line 11
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 12
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x25

    .line 13
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->d:Ll5/c;

    const-string v0, "modelDownloadLogEvent"

    .line 16
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 17
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x3

    .line 18
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->e:Ll5/c;

    const-string v0, "customModelLoadLogEvent"

    .line 21
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 22
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x14

    .line 23
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->f:Ll5/c;

    const-string v0, "customModelInferenceLogEvent"

    .line 26
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 27
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x4

    .line 28
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->g:Ll5/c;

    const-string v0, "customModelCreateLogEvent"

    .line 31
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 32
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x1d

    .line 33
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->h:Ll5/c;

    const-string v0, "onDeviceFaceDetectionLogEvent"

    .line 36
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 37
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x5

    .line 38
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->i:Ll5/c;

    const-string v0, "onDeviceFaceLoadLogEvent"

    .line 41
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 42
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x3b

    .line 43
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->j:Ll5/c;

    const-string v0, "onDeviceTextDetectionLogEvent"

    .line 46
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 47
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x6

    .line 48
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->k:Ll5/c;

    const-string v0, "onDeviceBarcodeDetectionLogEvent"

    .line 51
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 52
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/4 v2, 0x7

    .line 53
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->l:Ll5/c;

    const-string v0, "onDeviceBarcodeLoadLogEvent"

    .line 56
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 57
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x3a

    .line 58
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->m:Ll5/c;

    const-string v0, "onDeviceImageLabelCreateLogEvent"

    .line 61
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 62
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x30

    .line 63
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->n:Ll5/c;

    const-string v0, "onDeviceImageLabelLoadLogEvent"

    .line 66
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 67
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x31

    .line 68
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->o:Ll5/c;

    const-string v0, "onDeviceImageLabelDetectionLogEvent"

    .line 71
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 72
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x12

    .line 73
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->p:Ll5/c;

    const-string v0, "onDeviceObjectCreateLogEvent"

    .line 76
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 77
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x1a

    .line 78
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->q:Ll5/c;

    const-string v0, "onDeviceObjectLoadLogEvent"

    .line 81
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 82
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x1b

    .line 83
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 84
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 85
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->r:Ll5/c;

    const-string v0, "onDeviceObjectInferenceLogEvent"

    .line 86
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 87
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x1c

    .line 88
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 89
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 90
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->s:Ll5/c;

    const-string v0, "onDevicePoseDetectionLogEvent"

    .line 91
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 92
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x2c

    .line 93
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 94
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->t:Ll5/c;

    const-string v0, "onDeviceSegmentationLogEvent"

    .line 96
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 97
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x2d

    .line 98
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 99
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->u:Ll5/c;

    const-string v0, "onDeviceSmartReplyLogEvent"

    .line 101
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 102
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x13

    .line 103
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 104
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->v:Ll5/c;

    const-string v0, "onDeviceLanguageIdentificationLogEvent"

    .line 106
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 107
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x15

    .line 108
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->w:Ll5/c;

    const-string v0, "onDeviceTranslationLogEvent"

    .line 111
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 112
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x16

    .line 113
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 115
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->x:Ll5/c;

    const-string v0, "cloudFaceDetectionLogEvent"

    .line 116
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 117
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x8

    .line 118
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 119
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->y:Ll5/c;

    const-string v0, "cloudCropHintDetectionLogEvent"

    .line 121
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 122
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x9

    .line 123
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 124
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 125
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->z:Ll5/c;

    const-string v0, "cloudDocumentTextDetectionLogEvent"

    .line 126
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 127
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0xa

    .line 128
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 129
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->A:Ll5/c;

    const-string v0, "cloudImagePropertiesDetectionLogEvent"

    .line 131
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 132
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0xb

    .line 133
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 135
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->B:Ll5/c;

    const-string v0, "cloudImageLabelDetectionLogEvent"

    .line 136
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 137
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0xc

    .line 138
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 139
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 140
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->C:Ll5/c;

    const-string v0, "cloudLandmarkDetectionLogEvent"

    .line 141
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 142
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0xd

    .line 143
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 144
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 145
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->D:Ll5/c;

    const-string v0, "cloudLogoDetectionLogEvent"

    .line 146
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 147
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0xe

    .line 148
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 149
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 150
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->E:Ll5/c;

    const-string v0, "cloudSafeSearchDetectionLogEvent"

    .line 151
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 152
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0xf

    .line 153
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 154
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->F:Ll5/c;

    const-string v0, "cloudTextDetectionLogEvent"

    .line 156
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 157
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x10

    .line 158
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 159
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 160
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->G:Ll5/c;

    const-string v0, "cloudWebSearchDetectionLogEvent"

    .line 161
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 162
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x11

    .line 163
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 164
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 165
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->H:Ll5/c;

    const-string v0, "automlImageLabelingCreateLogEvent"

    .line 166
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 167
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x17

    .line 168
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 169
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 170
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->I:Ll5/c;

    const-string v0, "automlImageLabelingLoadLogEvent"

    .line 171
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 172
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x18

    .line 173
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 174
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 175
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->J:Ll5/c;

    const-string v0, "automlImageLabelingInferenceLogEvent"

    .line 176
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 177
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x19

    .line 178
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 179
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 180
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->K:Ll5/c;

    const-string v0, "isModelDownloadedLogEvent"

    .line 181
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 182
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x27

    .line 183
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 184
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 185
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->L:Ll5/c;

    const-string v0, "deleteModelLogEvent"

    .line 186
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 187
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x28

    .line 188
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 189
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 190
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->M:Ll5/c;

    const-string v0, "aggregatedAutomlImageLabelingInferenceLogEvent"

    .line 191
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 192
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x1e

    .line 193
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 194
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 195
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->N:Ll5/c;

    const-string v0, "aggregatedCustomModelInferenceLogEvent"

    .line 196
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 197
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x1f

    .line 198
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 199
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 200
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->O:Ll5/c;

    const-string v0, "aggregatedOnDeviceFaceDetectionLogEvent"

    .line 201
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 202
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x20

    .line 203
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 204
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 205
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->P:Ll5/c;

    const-string v0, "aggregatedOnDeviceBarcodeDetectionLogEvent"

    .line 206
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 207
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x21

    .line 208
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 209
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 210
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->Q:Ll5/c;

    const-string v0, "aggregatedOnDeviceImageLabelDetectionLogEvent"

    .line 211
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 212
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x22

    .line 213
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 214
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 215
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->R:Ll5/c;

    const-string v0, "aggregatedOnDeviceObjectInferenceLogEvent"

    .line 216
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 217
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x23

    .line 218
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 219
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 220
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->S:Ll5/c;

    const-string v0, "aggregatedOnDeviceTextDetectionLogEvent"

    .line 221
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 222
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x24

    .line 223
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 224
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 225
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->T:Ll5/c;

    const-string v0, "aggregatedOnDevicePoseDetectionLogEvent"

    .line 226
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 227
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x2e

    .line 228
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 229
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 230
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->U:Ll5/c;

    const-string v0, "aggregatedOnDeviceSegmentationLogEvent"

    .line 231
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 232
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x2f

    .line 233
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 234
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 235
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->V:Ll5/c;

    const-string v0, "remoteConfigLogEvent"

    .line 236
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 237
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x2a

    .line 238
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 239
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 240
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->W:Ll5/c;

    const-string v0, "inputImageConstructionLogEvent"

    .line 241
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 242
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x32

    .line 243
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 244
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 245
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->X:Ll5/c;

    const-string v0, "leakedHandleEvent"

    .line 246
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 247
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x33

    .line 248
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 249
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 250
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->Y:Ll5/c;

    const-string v0, "cameraSourceLogEvent"

    .line 251
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 252
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x34

    .line 253
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 254
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 255
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->Z:Ll5/c;

    const-string v0, "imageLabelOptionalModuleLogEvent"

    .line 256
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 257
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x35

    .line 258
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 259
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 260
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->a0:Ll5/c;

    const-string v0, "languageIdentificationOptionalModuleLogEvent"

    .line 261
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 262
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x36

    .line 263
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 264
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 265
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->b0:Ll5/c;

    const-string v0, "faceDetectionOptionalModuleLogEvent"

    .line 266
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 267
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x3c

    .line 268
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 269
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 270
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->c0:Ll5/c;

    const-string v0, "nlClassifierOptionalModuleLogEvent"

    .line 271
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 272
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x37

    .line 273
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 274
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 275
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->d0:Ll5/c;

    const-string v0, "nlClassifierClientLibraryLogEvent"

    .line 276
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 277
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x38

    .line 278
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 279
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 280
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->e0:Ll5/c;

    const-string v0, "accelerationAllowlistLogEvent"

    .line 281
    invoke-static {v0}, Ll5/c;->a(Ljava/lang/String;)Ll5/c$b;

    move-result-object v0

    new-instance v1, Lw3/w1;

    .line 282
    invoke-direct {v1}, Lw3/w1;-><init>()V

    const/16 v2, 0x39

    .line 283
    invoke-virtual {v1, v2}, Lw3/w1;->a(I)Lw3/w1;

    invoke-virtual {v1}, Lw3/w1;->b()Lw3/b2;

    move-result-object v1

    .line 284
    invoke-virtual {v0, v1}, Ll5/c$b;->b(Ljava/lang/annotation/Annotation;)Ll5/c$b;

    move-result-object v0

    .line 285
    invoke-virtual {v0}, Ll5/c$b;->a()Ll5/c;

    move-result-object v0

    sput-object v0, Lw3/h5;->f0:Ll5/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    check-cast p1, Lw3/g8;

    check-cast p2, Ll5/e;

    sget-object v0, Lw3/h5;->b:Ll5/c;

    .line 2
    invoke-virtual {p1}, Lw3/g8;->e()Lw3/x9;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->c:Ll5/c;

    .line 3
    invoke-virtual {p1}, Lw3/g8;->b()Lw3/d8;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->d:Ll5/c;

    .line 4
    invoke-virtual {p1}, Lw3/g8;->f()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->e:Ll5/c;

    const/4 v1, 0x0

    .line 5
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->f:Ll5/c;

    .line 6
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->g:Ll5/c;

    .line 7
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->h:Ll5/c;

    .line 8
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->i:Ll5/c;

    .line 9
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->j:Ll5/c;

    .line 10
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->k:Ll5/c;

    .line 11
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->l:Ll5/c;

    .line 12
    invoke-virtual {p1}, Lw3/g8;->c()Lw3/s8;

    move-result-object v2

    invoke-interface {p2, v0, v2}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->m:Ll5/c;

    .line 13
    invoke-virtual {p1}, Lw3/g8;->d()Lw3/v8;

    move-result-object v2

    invoke-interface {p2, v0, v2}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->n:Ll5/c;

    .line 14
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->o:Ll5/c;

    .line 15
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->p:Ll5/c;

    .line 16
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->q:Ll5/c;

    .line 17
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->r:Ll5/c;

    .line 18
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->s:Ll5/c;

    .line 19
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->t:Ll5/c;

    .line 20
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->u:Ll5/c;

    .line 21
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->v:Ll5/c;

    .line 22
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->w:Ll5/c;

    .line 23
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->x:Ll5/c;

    .line 24
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->y:Ll5/c;

    .line 25
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->z:Ll5/c;

    .line 26
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->A:Ll5/c;

    .line 27
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->B:Ll5/c;

    .line 28
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->C:Ll5/c;

    .line 29
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->D:Ll5/c;

    .line 30
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->E:Ll5/c;

    .line 31
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->F:Ll5/c;

    .line 32
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->G:Ll5/c;

    .line 33
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->H:Ll5/c;

    .line 34
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->I:Ll5/c;

    .line 35
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->J:Ll5/c;

    .line 36
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->K:Ll5/c;

    .line 37
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->L:Ll5/c;

    .line 38
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->M:Ll5/c;

    .line 39
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->N:Ll5/c;

    .line 40
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->O:Ll5/c;

    .line 41
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->P:Ll5/c;

    .line 42
    invoke-interface {p2, v0, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object v0, Lw3/h5;->Q:Ll5/c;

    .line 43
    invoke-virtual {p1}, Lw3/g8;->a()Lw3/r2;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->R:Ll5/c;

    .line 44
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->S:Ll5/c;

    .line 45
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->T:Ll5/c;

    .line 46
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->U:Ll5/c;

    .line 47
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->V:Ll5/c;

    .line 48
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->W:Ll5/c;

    .line 49
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->X:Ll5/c;

    .line 50
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->Y:Ll5/c;

    .line 51
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->Z:Ll5/c;

    .line 52
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->a0:Ll5/c;

    .line 53
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->b0:Ll5/c;

    .line 54
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->c0:Ll5/c;

    .line 55
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->d0:Ll5/c;

    .line 56
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->e0:Ll5/c;

    .line 57
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    sget-object p1, Lw3/h5;->f0:Ll5/c;

    .line 58
    invoke-interface {p2, p1, v1}, Ll5/e;->a(Ll5/c;Ljava/lang/Object;)Ll5/e;

    return-void
.end method
